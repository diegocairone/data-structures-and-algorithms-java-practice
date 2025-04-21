package com.cairone.bst;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BstNode {

    private final Integer value;

    @EqualsAndHashCode.Include
    private BstNode leftNode;

    @EqualsAndHashCode.Include
    private BstNode rightNode;

    public Integer getValue() {
        return value;
    }
}
