package cn.dayangshuo.junit5.params;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author DAYANG
 */
public class ParamsTests {

    /**
     * 判断一个字符串是否为回文串
     * @param str str
     * @return boolean
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("字符串为空");
        }
        int mid = (str.length() - 1) / 2;
        for (int i = 0; i <= mid; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba", "i am dayang"})
    void palindromes(String candidate) {
        Assertions.assertTrue(isPalindrome(candidate));
    }

//    @ParameterizedTest
//    @JsonFileSource(resources = {"/com/cq/common/KMPAlgorithm/test.json"})
//    public void test2Test(JSONObject arg) {
//        Animal animal = JSONObject.parseObject(arg.getString("Animal"),Animal.class);
//        List<String> stringList = JSONObject.parseArray(arg.getString("List<String>"),String.class);
//        when(testService.testOther(any(Student.class))).thenReturn(stringArg);
//        when(testService.testMuti(any(List.class),any(Integer.class))).thenReturn(stringList);
//        when(testService.getAnimal(any(Integer.class))).thenReturn(animal);
//        String result = kMPAlgorithm.test2();
//        //todo verify the result
//    }
}
