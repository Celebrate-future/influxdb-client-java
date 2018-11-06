/**
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.influxdata.flux

import javax.annotation.Nonnull
import org.influxdata.flux.impl.FluxClientScalaImpl
import org.influxdata.flux.option.FluxConnectionOptions
import org.influxdata.platform.Arguments

/**
 * The Factory that creates a instance of a Flux client.
 * 
 * @author Jakub Bednar (bednar@github) (05/11/2018 10:10)
 */
object FluxClientScalaFactory {

  /**
   * Create a instance of the Flux client.
   *
   * @param connectionString the connectionString to connect to InfluxDB.
   * @return client
   * @see FluxConnectionOptions.Builder#builder(String)
   */
  @Nonnull def create(@Nonnull connectionString: String): FluxClientScala = {
    val options = FluxConnectionOptions.builder(connectionString).build
    create(options)
  }

  /**
   * Create a instance of the Flux client.
   *
   * @param options the connection configuration
   * @return client
   */
  @Nonnull def create(@Nonnull options: FluxConnectionOptions): FluxClientScala = {
    Arguments.checkNotNull(options, "FluxConnectionOptions")
    new FluxClientScalaImpl(options)
  }
}
