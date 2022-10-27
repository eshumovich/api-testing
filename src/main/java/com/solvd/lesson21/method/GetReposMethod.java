package com.solvd.lesson21.method;

import com.qaprosoft.apitools.builder.NotStringValuesProcessor;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/users/eshumovich/repos?type=owner", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "/api/users/get/rs-repos.json")
public class GetReposMethod extends AbstractApiMethodV2 {

    public GetReposMethod() {
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
