package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FakeClassUnitTest {
    @Test
    fun addition_isCorrect() {
        val result = FakeClassToCheckTestCoverage().fakeFunction()
        assertTrue("Fake value postitive", result > 0 )
    }
}