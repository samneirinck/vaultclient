import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

object MainTests : FunSpec({
    test("Succeeding test") {
        1 shouldBe 1
    }
})