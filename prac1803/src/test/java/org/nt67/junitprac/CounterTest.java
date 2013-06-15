package org.nt67.junitprac;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CounterTest {
	public static class InitialStateTest {
		Counter counter;

		@Before
		public void instatiateCounter(){
			counter = new Counter();
		}

		@Test
		public void when_initialized_counter_is_0(){
			assertThat("initail count value is not 0", counter.getCount(), is(0));
			counter.increment();
			assertThat("first increment result is not 1", counter.getCount(), is(1));
		}

	}

	public static class After50timesIncrement{
		Counter counter;
		private static int SETUP_INCREMENT_TIMES = 50;

		@Before
		public void initializeCounter(){
			counter = new Counter();
			for(int i=0; i< SETUP_INCREMENT_TIMES; i++){
				counter.increment();
			}
		}

		@Test
		public void increment_is_countup_counter(){
			assertThat(counter.getCount(), is(SETUP_INCREMENT_TIMES));
			counter.increment();
			assertThat(counter.getCount(), is(SETUP_INCREMENT_TIMES+1));
		}
	}

}
