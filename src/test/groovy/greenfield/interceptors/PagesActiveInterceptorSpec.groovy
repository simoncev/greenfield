package greenfield.interceptors


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PagesActiveInterceptor)
class PagesActiveInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test pagesActive interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"pagesActive")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
