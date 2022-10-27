package com.solvd.lesson21;

import com.qaprosoft.apitools.validation.JsonComparatorContext;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.solvd.lesson21.method.*;
import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void getRepos() {
        GetReposMethod getReposMethod = new GetReposMethod();
        getReposMethod.setHeaders(String.format("Authorization=%s", "Bearer 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"));
        getReposMethod.callAPI();
        getReposMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getReposMethod.validateResponse();
    }

    @Test
    public void getRepo() {
        GetRepoMethod getRepoMethod = new GetRepoMethod();
        getRepoMethod.setHeaders(String.format("Authorization=%s", "Bearer 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"));
        getRepoMethod.callAPI();
        getRepoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getRepoMethod.validateResponse();
    }

    @Test
    public void createRepo() {
        PostRepoMethod postRepoMethod = new PostRepoMethod();
        postRepoMethod.setHeaders(String.format("Authorization=%s", "Bearer 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"));
        postRepoMethod.callAPI();

        JsonComparatorContext comparatorContext = JsonComparatorContext.context()
                .<String>withPredicate("createdPredicate", created -> created.startsWith("2022"))
                .<String>withPredicate("updatedPredicate", updated -> updated.startsWith("2022"))
                .<String>withPredicate("pushedPredicate", pushed -> pushed.startsWith("2022"))
                .<String>withPredicate("nodeIdPredicate", nodeId -> nodeId.contains("_"))
                .<Integer>withPredicate("idPredicate", id -> id > 1);


        postRepoMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postRepoMethod.validateResponse(comparatorContext);
    }

    @Test
    public void deleteRepo() {
        DeleteRepoMethod deleteRepoMethod = new DeleteRepoMethod();
        deleteRepoMethod.setHeaders(String.format("Authorization=%s", "Bearer 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"));
        deleteRepoMethod.callAPI();
        deleteRepoMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
    }

    @Test
    public void putRepo() {
        PutRepoMethod putRepoMethod = new PutRepoMethod();
        putRepoMethod.setHeaders(String.format("Authorization=%s", "Bearer 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"));
        putRepoMethod.callAPI();
        putRepoMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
    }
}
