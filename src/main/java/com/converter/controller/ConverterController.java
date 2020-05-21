package com.converter.controller;

import com.devskiller.friendly_id.FriendlyId;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by sdrahnea
 */
@RestController
public class ConverterController {

    @GetMapping(value = "/friendlyIdToUuid/{friendlyId}")
    public String convertFriendlyIdToUUID(@PathVariable("friendlyId") String friendlyId) {
        return FriendlyId.toUuid(friendlyId).toString();
    }

    @GetMapping(value = "/uuidToFriendlyId/{uuid}")
    public String convertUUIDToFriendlyId(@PathVariable("uuid") String uuid) {
        return FriendlyId.toFriendlyId(UUID.fromString(uuid));
    }

}
