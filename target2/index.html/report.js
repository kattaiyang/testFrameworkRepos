$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:payments.feature");
formatter.feature({
  "name": "payment options in amazon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user access to make the payment using CC",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SIT,"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user has valid CC registed in the portal",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentsDef.user_has_valid_CC_registed_in_the_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides the valid CVV",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentsDef.user_provides_the_valid_CVV()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the OTP recieved",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentsDef.enters_the_OTP_recieved()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "payment success through CC",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentsDef.payment_success_through_CC()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user access to make the payment using UPI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SIT,"
    },
    {
      "name": "@Regression,"
    },
    {
      "name": "@UAT"
    }
  ]
});
formatter.step({
  "name": "user has valid UPI",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentsDef.user_has_valid_UPI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opts by entering the upi ID",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentsDef.user_opts_by_entering_the_upi_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "accepts the request payment in UPI app",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentsDef.accepts_the_request_payment_in_UPI_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "payemnt is success in UPI",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentsDef.payemnt_is_success_in_UPI()"
});
formatter.result({
  "status": "passed"
});
});