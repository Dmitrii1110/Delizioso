package com.proect.delizioso.common

interface EventHandler<E> {

    fun obtainEvent(event: E)
}