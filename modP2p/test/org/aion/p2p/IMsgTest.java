package org.aion.p2p;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.aion.p2p.CTRL;

public class IMsgTest {

    @Test
    public void testCTRL() {
        
        /**
         * getValue 
         */
        for(CTRL type: CTRL.values()) {
            int typeInt = type.getValue();
            assertEquals(typeInt, CTRL.getType(typeInt).getValue());
        }
             
        /**
         * Out range
         */
        CTRL type = CTRL.getType(CTRL.MIN - 1);
        assertNull(type);
        type = CTRL.getType(CTRL.MAX + 1);
        assertNull(type);
        
        /**
         * Unregistered
         */
        type = CTRL.getType(CTRL.MAX);
        assertNull(type);
        
    }
}
