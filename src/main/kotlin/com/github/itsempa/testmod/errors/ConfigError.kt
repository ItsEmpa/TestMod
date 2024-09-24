package com.github.itsempa.testmod.errors

class ConfigError(message: String, cause: Throwable) : Error(message, cause)