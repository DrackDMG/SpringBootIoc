package com.drackmg.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponetA {
    @Autowired
    private ComponetB componetB;
}
