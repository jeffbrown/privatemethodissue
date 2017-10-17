package privatemethodissue

class DemoController {

    DemoService demoService

    def index() {}

    String somePublicMethod() {
        demoService.someString
    }

    protected String someProtectedMethod() {
        demoService.someString
    }

    private String somePrivateMethod() {
        demoService.someString
    }
}
