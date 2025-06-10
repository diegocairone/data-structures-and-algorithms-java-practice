package com.cairone.bst.traversal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MyIntegerNode {

    private final Integer value;

    @EqualsAndHashCode.Include
    private MyIntegerNode leftNode;

    @EqualsAndHashCode.Include
    private MyIntegerNode rightNode;

    public Integer getValue() {
        return value;
    }
}
