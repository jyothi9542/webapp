package icici.common.repository

import icici.common.entity.AppConfigEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AppConfigRepository extends JpaRepository<AppConfigEntity, Long> {
}
