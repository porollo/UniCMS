package com.unicms.core.repository;

import com.unicms.core.model.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static javax.print.attribute.standard.MediaSizeName.B;

public interface SettingsRepository extends JpaRepository<Settings, Long> {

}
