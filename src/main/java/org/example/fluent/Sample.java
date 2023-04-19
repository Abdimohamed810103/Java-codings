package org.example.fluent;

import java.util.function.Consumer;

class Mailers {
    public void print(String msg) {
        System.out.println(msg);
    }

    public Mailers from(String addr) {
        System.out.println(addr);
        return this;
    }

    public Mailers to(String to) {
        System.out.println(to);
        return this;
    }

    public Mailers title(String title) {
        System.out.println(title);
        return this;
    }

    public Mailers body(String body) {
        System.out.println(body);
        return this;
    }

    public static void send(Consumer<Mailers> consumer) {
        Mailers mailers = new Mailers();
        consumer.accept(mailers);
        System.out.println("Sending ....");
    }

}

public class Sample {
    public static void main(String[] args) {
        Mailers.send(mailer->mailer
                .from("cabdirisaq@gmail.com")
                .to("cabdirisaq@gmail.com")
                .title("Igu soo celi")
                .body("Markii aadn wada hadalnay ee gu danbeysay waxa aad igu tiri sidaan akhi")
        );


    }
}
