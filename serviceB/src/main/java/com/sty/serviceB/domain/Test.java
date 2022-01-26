package com.sty.serviceB.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Test.
 *
 * @author shitianyu 2022-01-19 14:50
 */
@Data
@Document(collection = "activity")
public class Test {

    @Id
    private Long activityId;

    private String losingAgainButton;

}
