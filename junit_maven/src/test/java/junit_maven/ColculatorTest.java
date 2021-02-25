package junit_maven;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class ColculatorTest {

	@Test
	public void Calculator_plusは１と２の足し算を返す() {
		//SetUp
		Calculator calc = new Calculator();
		int expect = 3;
		//Exersice
		int actual = calc.plus(1, 2);
		//Verify
		assertThat(actual, is(expect));
	}

	@Test
	public void Calculator_plusは2と５の足し算を返す() {
		//SetUp
		Calculator calc = new Calculator();
		int expect = 7;
		//Exersice
		int actual = calc.plus(2, 5);
		//Verify
		assertThat(actual, is(expect));
	}

	@Test
	public void Calculator_minusは５と２の引き算を返す() {
		//SetUp
		Calculator calc = new Calculator();
		int expected = 3;
		//Exersice
		int actual = calc.minus(5, 2);
		//Verify
		assertThat(actual, is(expected));
	}

	@Test
	public void Calculator_minusは７と３の引き算を返す() {
		//SetUp
		Calculator calc = new Calculator();
		int expected = 4;
		//Exersice
		int actual = calc.minus(7, 3);
		//Verify
		assertThat(actual, is(expected));
	}
}
