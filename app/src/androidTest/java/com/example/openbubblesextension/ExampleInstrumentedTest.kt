package com.example.openbubblesextension

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.openbubblesextension", appContext.packageName)
    }
    @Test
    fun testSwitch() {
        val dataUrl = "data:?ver=52&data=5kc59o?a20ai3n2%3D,Ub8C,3of,78i%3D00oCI%2547a%25d.%25a0%3D2%26_NH55t-Htre%260eip0e-5yiY1A04023.or2m5B76Q4%25%25o0UbeI71beEt_5C%25eocfcc2,-C6k04c%3Don99%3DlC0e%26%3DLc%3Dsg,o%26o2lcld62or%2695u%25%25rL2eFsV7CDCln%3De062vm531,al7e.tt-orC528l717CTsW.96,%258%267a5e0h60u3l-ACFcta,atA%3D1h.8y-Scdrn5ot.1Cih2%3D9Zt59-e9ed5Y7te%3DCrnH_O416usn,o,v.yryC05.5%26,kle7,a%3D1.m0%3D0tC7O,Fgc_n58g703!4iT%25C0Ads61,3atn0hn31ACobp02B%26t9,41f%25m2dEo7CDUd4s.r39in_n10e0E%256,nr21x,5qb%267l55%26-HlpC8ihHyae%25DrwehFn%267%3DmB%3D4o0y9rCdp4s,003CeOor9lpmsla7h,00732ai%26al5I0sHA7s%26Vsavs.%3Ds20,u43Bsr%26r%25aVCc3Fa%252t%3Da,toW'k8n7Ch8v,govDe0u%26%26e4udE.t0y%257aoso334r717a4h01.0.0%25rg91"
        val switch = GamePigeon(dataUrl)
        switch.main()
    }
}