package com.proect.delizioso.ui.screens.login.models

sealed class LoginEvent {
    object ActionClicked : LoginEvent()
}