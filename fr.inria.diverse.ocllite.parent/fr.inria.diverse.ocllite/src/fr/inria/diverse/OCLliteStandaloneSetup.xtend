/*
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class OCLliteStandaloneSetup extends OCLliteStandaloneSetupGenerated {

	def static void doSetup() {
		new OCLliteStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
