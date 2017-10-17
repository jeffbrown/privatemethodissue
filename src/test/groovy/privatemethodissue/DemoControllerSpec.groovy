package privatemethodissue

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

    def setup() {
        controller.demoService = Mock(DemoService) {
            getSomeString() >> 'Some Mock String'
        }
    }

    void "test using a public helper method"() {
        expect:
        controller.somePublicMethod() == 'Some Mock String'
    }

    void "test using a protected helper method"() {
        expect:
        controller.someProtectedMethod() == 'Some Mock String'
    }

    void "test using a private helper method"() {
        expect:
        controller.somePrivateMethod() == 'Some Mock String'
    }
}
