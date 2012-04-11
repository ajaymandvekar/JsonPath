package com.jayway.jsonpath;

import org.junit.Test;

import static junit.framework.Assert.assertNull;

/**
 * Created by IntelliJ IDEA.
 * User: kallestenflo
 * Date: 2/29/12
 * Time: 8:42 AM
 */
public class IssuesTest {
    @Test
    public void issue_7() throws Exception {

        String json = "{ \"foo\" : [\n" +
                "  { \"id\": 1 },  \n" +
                "  { \"id\": 2 },  \n" +
                "  { \"id\": 3 }\n" +
                "  ] }";


        assertNull(JsonPath.read(json, "$.foo.id"));
    }
    
    @Test
    public void issue_11() throws Exception {
        //String json = "{ \"foo\" : [] }";
        //JsonPath.read(json, "$.foo[?(@.rel= 'item')][0].uri");
    }

}