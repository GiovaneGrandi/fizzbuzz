package com.mentoria

import spock.lang.Specification

class FizzBuzzSpec extends Specification {
    def "fizzBuzz deve retornar 'Fizz' para múltiplos de 3"() {
        given:
        FizzBuzz fizzBuzz = new FizzBuzz()

        expect:
        fizzBuzz.validaFizzBuzz(number) == expected

        where:
        number || expected
        3      || "Fizz"
        6      || "Fizz"
        9      || "Fizz"
    }

    def "fizzBuzz deve retornar 'Buzz' para múltiplos de 5"() {
        given:
        FizzBuzz fizzBuzz = new FizzBuzz()

        expect:
        fizzBuzz.validaFizzBuzz(number) == expected

        where:
        number || expected
        5      || "Buzz"
        10     || "Buzz"
        20     || "Buzz"
    }

    def "fizzBuzz deve retornar 'FizzBuzz' para múltiplos de 3 e 5"() {
        given:
        FizzBuzz fizzBuzz = new FizzBuzz()

        expect:
        fizzBuzz.validaFizzBuzz(number) == expected

        where:
        number || expected
        15     || "FizzBuzz"
        30     || "FizzBuzz"
        45     || "FizzBuzz"
    }

    def "fizzBuzz deve retornar o número para não múltiplos de 3 e 5"() {
        given:
        FizzBuzz fizzBuzz = new FizzBuzz()

        expect:
        fizzBuzz.validaFizzBuzz(number) == expected

        where:
        number || expected
        1      || "1"
        2      || "2"
        4      || "4"
        7      || "7"
    }
}
