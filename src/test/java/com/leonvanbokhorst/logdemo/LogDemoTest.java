package com.leonvanbokhorst.logdemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogDemoTest {

  private LogDemo sut;

  @Before
  public void setUp() {
    // assign
    this.sut = new LogDemo();
  }

  @Test
  public void shouldLogSomething() {
    // act
    this.sut.logSomething("Log baby, yeah!");

    // assert
    assertTrue(true);
  }

  @Test
  public void shouldLogMoreThings() {
    // act
    sut.logSomething("We've got a logger.");
    sut.logSomething("We've got another logger.");
    sut.logSomething("We've got a couple of loggers.");

    // assert
    assertTrue(true);
  }

  @Test
  public void logError() {
    // act
    this.sut.logError("Bam!");

    // assert
    assertTrue(true);
  }
}
