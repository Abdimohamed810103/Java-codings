package org.example.string;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public final class BuilderPattern {
   private final String firstName;
   private final String password;
   private final String nickname;
   private final String state;

private BuilderPattern(BuilderPattern.Builder builder){
    this.firstName = builder.firstName;
    this.password = builder.password;
    this.nickname = builder.nickname;
    this.state = builder.state;
}
public static Builder getBuilder(String firstName, String password){
      return new BuilderPattern.Builder(firstName, password);
}

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "firstName='" + firstName + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public static final class Builder{
    private final String firstName;
    private final String password;
    private  String nickname;
    private  String state;
public Builder(String firstName, String password){
    this.firstName = firstName;
    this.password = password;
}
   public Builder nickname(String nickname){
    this.nickname = nickname;
    return this;
   }
    public Builder state(String state){
        this.state = state;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }
   public BuilderPattern build(){
    return new BuilderPattern(this);
   }
    public String getState() {
        return state;
    }


}

    public static void main(String[] args) {
        BuilderPattern builderPattern = getBuilder("abdi","abdi1234")
                .state("somalia")
                .nickname("Cali")
                .build();
        System.out.println(builderPattern);
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(localDate);
        System.out.println(format);

        Instant instant = Instant.now();
        System.out.println(instant.toString());
        Clock clock = Clock.systemUTC();
        System.out.println(clock.toString());

        Instant instant1 = Instant.now().plus(2, ChronoUnit.HOURS);
        System.out.println(instant1);

    }
}

