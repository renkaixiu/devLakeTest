//import com.google.gson.Gson;
//import org.apache.commons.lang3.StringUtils;
//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.zip.GZIPInputStream;
//import java.util.zip.GZIPOutputStream;
//
///**
// * 功能描述：
// *
// * @author renkaixiu
// * @date 2022/4/21
// **/
//public class ClassTest implements Serializable {
//    public static <T> List<T> getData(Class<T> clazz) {
//        List<T> list = new ArrayList<>();
//        list.add(new Gson().fromJson("{\"id\":\"1\"}", clazz));
//        return list;
//    }
//    class Test implements Serializable {
//        private String id;
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        List<Test> l = getData(Test.class);
//        System.out.println(l.size());
//        Map<String, Test> m = new HashMap<>();
//        Test t = new ClassTest().new Test();
//        t.setId("1");
//        m.put("a", t);
//        m.get("a").setId("2");
//        System.out.println(m.get("a"));
//
//        String s = compress(toByteArray(t));
//        String result1 = unCompress(s);
//        System.out.println(result1);
//
//
//    }
//
//    public static byte[] toByteArray(Object obj) {
//        byte[] bytes = null;
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        try {
//            ObjectOutputStream oos = new ObjectOutputStream(bos);
//            oos.writeObject(obj);
//            oos.flush();
//            bytes = bos.toByteArray ();
//            oos.close();
//            bos.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        return bytes;
//    }
//
//
//
//    public static String compress(Object o) throws IOException {
//        long start = System.currentTimeMillis();
//
//        ObjectOutputStream objectOut = new ObjectOutputStream();
//        try (GZIPOutputStream gzip = new GZIPOutputStream(out)) {
//            gzip.write(o);
//        } catch (IOException e) {
//        } finally {
//            try {
//                out.close();
//            } catch (IOException e) {
//            }
//
//        }
//        //由于压缩后的数据需要传输，所以用了BASE64编码
//        String result = new BASE64Encoder().encode(out.toByteArray());//最终改成这里获得压缩数据
//        long cost = System.currentTimeMillis()-start;
//        if(cost>5){
//        }
//
//        return result;
//
//    }
//
//
//    public static String unCompress(String str) throws IOException {
//        long start = System.currentTimeMillis();
//        if (StringUtils.isEmpty(str)) {
//            return null;
//        }
//        byte[] decode = new BASE64Decoder().decodeBuffer(str);
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        try (GZIPInputStream gzipStream = new GZIPInputStream(new ByteArrayInputStream(decode));) {
//            byte[] buffer = new byte[256];
//            int n;
//            while ((n = gzipStream.read(buffer)) >= 0) {
//                out.write(buffer, 0, n);
//            }
//        } catch (IOException e) {
//        }
//        String result = new String(out.toByteArray(), "utf-8");
//        long cost = System.currentTimeMillis()-start;
//        if(cost>5){
//        }
//        return result;
//
//    }
//
//
//}
