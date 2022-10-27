package com.solvd.lesson21.method;

import com.qaprosoft.apitools.builder.NotStringValuesProcessor;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/repos/eshumovich/lawyer-office-project", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "/api/users/get/rs-repo.json")
public class GetRepoMethod extends AbstractApiMethodV2 {

    public GetRepoMethod() {
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
