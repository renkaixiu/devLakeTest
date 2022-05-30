import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        BatchEventEntity batchEntity = JSON.parseObject("{\"dataSourceId\":\"[\\\"a31f67bde45f59f525d9b0b35783ee20e243eadd\\\"]\",\"date\":\"20220503\",\"traceContext\":{\"spanId\":0,\"resultStatus\":\"success\",\"startTime\":0,\"endTime\":0,\"procTime\":0,\"rootTraceStartTime\":0,\"costFromHandler\":0}}", BatchEventEntity.class);
//        System.out.println(batchEntity);

        String s = "dfergthyjy0x00";
        s = s.replace((char) 0x00, ' ');
        s = s.replaceAll("\\u0000", "");
        System.out.println(s);
    }

    public static class BatchEventEntity {
        private String dataSourceId;
        private String date;

        public String getDataSourceId() {
            return dataSourceId;
        }

        public void setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

}



