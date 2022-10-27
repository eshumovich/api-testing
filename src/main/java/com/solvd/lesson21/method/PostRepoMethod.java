package com.solvd.lesson21.method;

import com.qaprosoft.apitools.builder.NotStringValuesProcessor;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/user/repos", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "/api/users/post/rq.json")
@ResponseTemplatePath(path = "/api/users/post/rs.json")
public class PostRepoMethod extends AbstractApiMethodV2 {

    public PostRepoMethod() {
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
