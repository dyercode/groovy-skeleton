import spock.lang.Specification
import spock.lang.Unroll

class ExampleSpec extends Specification {

    void 'A simple spec'() {
        expect:
        true
    }

    @Unroll('Greeting Spock with #salutation must result in #expected')
    void 'fully blown-out spec'() {
        given: 'A greeter'
        Closure<String> spockGreeter = { "$it, Spock!" }

        when:
        String actualGreeting = spockGreeter(salutation)

        then:
        actualGreeting == expected

        where:
        salutation | expected
        'Hello'    | 'Hello, Spock!'
        'Goodbye'  | 'Goodbye, Spock!'
    }

}
