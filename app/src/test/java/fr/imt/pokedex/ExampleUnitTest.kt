package fr.imt.pokedex

import fr.imt.pokedex.data.Datasource
import fr.imt.pokedex.model.Pokemon
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun verify_size() {
        val dataset: List<Pokemon> = Datasource().loadPokemons()
        assertEquals(dataset.size, 9)
    }
}