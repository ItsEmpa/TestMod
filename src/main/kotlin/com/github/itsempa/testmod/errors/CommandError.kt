package com.github.itsempa.testmod.errors

class CommandError(message: String, cause: Throwable) : Error(message, cause)