package patches.templates

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the template with id = 'Common'
accordingly, and delete the patch script.
*/
changeTemplate(RelativeId("Common")) {
    vcs {
        expectEntry(DslContext.settingsRoot.id!!, "-:.teamcity")
        root(DslContext.settingsRoot.id!!)
    }
}
