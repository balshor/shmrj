package com.bizo.hive.mr;
/*
 * Copyright 2009 bizo.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
import java.util.Iterator;

/**
 * Simple reducer interface.
 * 
 * @author larry <larry@bizo.com>
 */
public interface Reducer {
  /**
   * Reduce.
   * 
   * Note that it is assumed that the key is the first column.  Additionally, the key
   * will be repeated as the first column in the records[] array.
   * 
   * @param key key (first column) for this set of records.
   * @param records Iterator of records for this key.  Note that the first column of record will also be the key.
   * @param output
   * @throws Exception
   */
  void reduce(String key, Iterator<String[]> records, Output output) throws Exception;
  
  /**
   * Called after all rows have been reduced.
   */
  void close() throws Exception;
}
