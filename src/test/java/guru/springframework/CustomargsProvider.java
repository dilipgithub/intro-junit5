package guru.springframework;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class CustomargsProvider implements ArgumentsProvider{

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		
		return Stream.of(Arguments.of("MH",2000),Arguments.of("MH",3000),Arguments.of("MH",4000));
	}

}
