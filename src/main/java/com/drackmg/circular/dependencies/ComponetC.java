package com.drackmg.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ComponetC {
    @Autowired
    @Lazy
    private ComponetA componetA;
}
