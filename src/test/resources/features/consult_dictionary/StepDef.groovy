package features.consult_dictionary

import cucumber.api.PendingException


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Then(~/^error message show$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}