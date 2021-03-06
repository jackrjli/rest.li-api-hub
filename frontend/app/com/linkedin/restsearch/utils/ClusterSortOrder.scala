/*
   Copyright (c) 2014 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.linkedin.restsearch.utils

/**
 * Ordering to sort cluster names ignoring case
 *
 * @author kparikh
 */
object ClusterSortOrder extends Ordering[String] {
  def compare(clusterName1: String, clusterName2: String) = {
    clusterName1.toLowerCase.compareTo(clusterName2.toLowerCase)
  }
}
