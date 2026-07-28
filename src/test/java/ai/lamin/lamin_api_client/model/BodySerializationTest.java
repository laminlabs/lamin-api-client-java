package ai.lamin.lamin_api_client.model;

import ai.lamin.lamin_api_client.JSON;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Serialization tests for {@link Body}: explicit null values (e.g. nullable
 * conflict columns such as {@code feature_id} in link-table upserts) must
 * survive serialization instead of being dropped by Gson.
 */
public class BodySerializationTest {

    @Test
    public void listOfRecordsKeepsExplicitNulls() {
        Map<String, Object> record = new LinkedHashMap<>();
        record.put("artifact_id", 1);
        record.put("project_id", 2);
        record.put("feature_id", null);
        Body body = new Body(Arrays.asList(record));

        String json = JSON.getGson().toJson(body);

        assertEquals("[{\"artifact_id\":1,\"project_id\":2,\"feature_id\":null}]", json);
    }

    @Test
    public void bareMapSerializesAsObject() {
        Map<String, Object> record = new LinkedHashMap<>();
        record.put("artifact_id", 1);
        record.put("feature_id", null);
        Body body = new Body(record);

        String json = JSON.getGson().toJson(body);

        assertEquals("{\"artifact_id\":1,\"feature_id\":null}", json);
    }
}
