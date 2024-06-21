package guru.springframework;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/*@ExtendWith(TimingExtension.class)*/
class TestTestIT {

	@RepeatedTest(value = 5)
	@DisplayName("test")
	void test(TestInfo objTestInfo, RepetitionInfo objRepeatedTest) {
		System.out.println(objTestInfo.getDisplayName() +":"+ objRepeatedTest.getCurrentRepetition());
	}
	
	@DisplayName("Parameterized Test")
	@ParameterizedTest
	@ValueSource(strings = {"Dilip","Divej"})
	void testHelloWorldString(String param) {
		System.out.println(param);
	}
	
	@DisplayName("Eunm Test")
	@ParameterizedTest
	@EnumSource(TestEnum.class)
	void testHelloWorldString2(TestEnum e) {
		System.out.println(e);
	}
	
	@DisplayName("CSV Test")
	@ParameterizedTest
	@CsvSource({
		"MH,20",
		"MH,12",
		"MH,14"
	})
	void testHelloWorldString3(String state, int passing) {
		System.out.println(state +"="+passing);
	}
	
	@DisplayName("CSV Test2")
	@ParameterizedTest
	@CsvFileSource(
		resources="/testcsv.csv", numLinesToSkip = 1
	)
	void testHelloWorldString4(String state, int passing) {
		System.out.println(state +"=="+passing);
	}

	@DisplayName("CSV Test2")
	@ParameterizedTest
	@MethodSource("getArgs")
	void testHelloWorldString41(String state, int passing) {
		System.out.println(state +"=="+passing);
	}
	static Stream<Arguments> getArgs(){
		return Stream.of(Arguments.of("MH",200),Arguments.of("MH",300),Arguments.of("MH",400));
	}
	
	@DisplayName("Method Provider Test Custom")
	@ParameterizedTest
	@ArgumentsSource(CustomargsProvider.class)
	void testHelloWorldString6(String state, int passing) {
		System.out.println(state +"=="+passing);
	}
	
	
	


}
