package com.telusko.demo_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    /* Field injection
        @Autowired
        private Laptop laptop;
    */

    /* Constructur injection
        public Dev(Laptop laptop) {  // --> @Autowired added by default
            this.laptop = laptop;
        }
    */

    /* Setter Injection
        @Autowired
        private Laptop laptop;
        public void setLaptop(Laptop laptop) {
            this.laptop = laptop;
        }
    */
    @Autowired
    @Qualifier("laptop")
    private Computer computer;
    public void build() {
        computer.compile();
        System.out.println("Dev: Build is successfully done...");
    }
}
