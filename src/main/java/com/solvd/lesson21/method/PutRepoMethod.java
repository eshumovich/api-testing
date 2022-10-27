package com.solvd.lesson21.method;

import com.qaprosoft.apitools.builder.NotStringValuesProcessor;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/repos/eshumovich/Test-Postman/automated-security-fixes", methodType = HttpMethodType.PUT)
public class PutRepoMethod extends AbstractApiMethodV2 {

    public PutRepoMethod() {
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
