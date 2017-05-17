/**
 * This package is an example of Mixin Interface to make Enum's flexible and extendible.
 *
 * A Mixin is an interface which contains a combination of methods from other classes.
 * It encourages code reuse and avoid multiple inheritance as well.
 *
 * The solution has a few parts:
 * 1. Define an interface with the needed functionality.
 * 2. Declare enums implementing the interface.
 * 3. Include a factory method mapping from names to objects implementing the interface.
 *
 * This combination of a enum for known values and an interface for extensibility provides a
 * good alternative to string-based provider lookups.
 *
 * Created by sgholve on 11/13/14.
 */
package com.sandeep.designpatterns.mixin;