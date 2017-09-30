/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.saga.core.dag;

import java.util.Set;

public class FromRootTraversalDirection<C, T> implements TraversalDirection<C, T> {

  @Override
  public Node<C, T> root(SingleLeafDirectedAcyclicGraph<C, T> dag) {
    return dag.root();
  }

  @Override
  public Set<Node<C, T>> parents(Node<C, T> node) {
    return node.parents();
  }

  @Override
  public Set<Node<C, T>> children(Node<C, T> node) {
    return node.children();
  }
}