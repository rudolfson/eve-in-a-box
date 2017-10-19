package eveinabox

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class CharacterSpec extends Specification implements DomainUnitTest<Character> {

    @Subject
    Character domain

    def setup() {
        domain = new Character()
    }

    @Unroll('Character.validate() with name: \'#value\' should have returned #expected with errorCode: #expectedErrorCode')
    void 'test name validation'() {
        when:
        domain.name = value

        then:
        expected == domain.validate(['name'])
        domain.errors['name']?.code == expectedErrorCode

        where:
        value                                                 | expected | expectedErrorCode
        null                                                  | false    | 'nullable'
        ''                                                    | false    | 'blank'
        'Billable Beutlin'                                    | true     | null
        'lahsdflkhlahdfhlasdfhahdfhlkashdflhlkahsdfh' +
                'kakhdfhladhflhlkasdfiadhflkhaklsdhflhlasdfh' +
                'kakhdfhladhflhlkasdfiadhflkhaklsdhflhlasdfh' +
                'kakhdfhladhflhlkasdfiadhflkhaklsdhflhlasdfh' +
                'kakhdfhladhflhlkasdfiadhflkhaklsdhflhlasdfh' +
                'lahdfhhasdfhlhaksdfhlhaldhfhasdlfhlhlfhfkhl' | false    | 'maxSize.exceeded'

    }
}
