package com.bizo.hive.mr;

/**
 * Abstract reducer that provides an empty implementation of the close method.
 * 
 * @author darren
 * 
 */
public abstract class AbstractReducer implements Reducer {

  @Override
  public void close() throws Exception {

  }

}
