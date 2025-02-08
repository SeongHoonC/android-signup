package nextstep.signup.signupvalidation

class SignUpValidPasswordConfirm(private val password: String) : (String) -> SignUpInvalidType? {
    override fun invoke(input: String): SignUpInvalidType? {
        return when {
            password != input -> SignUpInvalidType.INVALID_PASSWORD_CONFIRM
            else -> null
        }
    }
}
