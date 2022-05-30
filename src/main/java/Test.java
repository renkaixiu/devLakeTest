

public class Test {

    public static void main(String[] args) {
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



