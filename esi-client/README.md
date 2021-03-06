# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import eve.esi.invoke.*;
import eve.esi.invoke.auth.*;
import eve.esi.model.*;
import eve.esi.api.AllianceApi;

import java.io.File;
import java.util.*;

public class AllianceApiExample {

    public static void main(String[] args) {
        
        AllianceApi apiInstance = new AllianceApi();
        String datasource = "tranquility"; // String | The server name you would like data from
        String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
        String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
        try {
            List<Integer> result = apiInstance.getAlliances(datasource, userAgent, xUserAgent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AllianceApi#getAlliances");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://esi.tech.ccp.is*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllianceApi* | [**getAlliances**](docs/AllianceApi.md#getAlliances) | **GET** /v1/alliances/ | List all alliances
*AllianceApi* | [**getAlliancesAllianceId**](docs/AllianceApi.md#getAlliancesAllianceId) | **GET** /v2/alliances/{alliance_id}/ | Get alliance information
*AllianceApi* | [**getAlliancesAllianceIdCorporations**](docs/AllianceApi.md#getAlliancesAllianceIdCorporations) | **GET** /v1/alliances/{alliance_id}/corporations/ | List alliance&#39;s corporations
*AllianceApi* | [**getAlliancesAllianceIdIcons**](docs/AllianceApi.md#getAlliancesAllianceIdIcons) | **GET** /v1/alliances/{alliance_id}/icons/ | Get alliance icon
*AllianceApi* | [**getAlliancesNames**](docs/AllianceApi.md#getAlliancesNames) | **GET** /v1/alliances/names/ | Get alliance names
*AssetsApi* | [**getCharactersCharacterIdAssets**](docs/AssetsApi.md#getCharactersCharacterIdAssets) | **GET** /v1/characters/{character_id}/assets/ | Get character assets
*AssetsApi* | [**getCorporationsCorporationIdAssets**](docs/AssetsApi.md#getCorporationsCorporationIdAssets) | **GET** /v1/corporations/{corporation_id}/assets/ | Get corporation assets
*AssetsApi* | [**postCharactersCharacterIdAssetsLocations**](docs/AssetsApi.md#postCharactersCharacterIdAssetsLocations) | **POST** /v1/characters/{character_id}/assets/locations/ | Get character asset locations
*AssetsApi* | [**postCharactersCharacterIdAssetsNames**](docs/AssetsApi.md#postCharactersCharacterIdAssetsNames) | **POST** /v1/characters/{character_id}/assets/names/ | Get character asset names
*BookmarksApi* | [**getCharactersCharacterIdBookmarks**](docs/BookmarksApi.md#getCharactersCharacterIdBookmarks) | **GET** /v1/characters/{character_id}/bookmarks/ | List bookmarks
*BookmarksApi* | [**getCharactersCharacterIdBookmarksFolders**](docs/BookmarksApi.md#getCharactersCharacterIdBookmarksFolders) | **GET** /v1/characters/{character_id}/bookmarks/folders/ | List bookmark folders
*BookmarksApi* | [**getCorporationsCorporationIdBookmarks**](docs/BookmarksApi.md#getCorporationsCorporationIdBookmarks) | **GET** /v1/corporations/{corporation_id}/bookmarks/ | List corporation bookmarks
*BookmarksApi* | [**getCorporationsCorporationIdBookmarksFolders**](docs/BookmarksApi.md#getCorporationsCorporationIdBookmarksFolders) | **GET** /v1/corporations/{corporation_id}/bookmarks/folders/ | List corporation bookmark folders
*CalendarApi* | [**getCharactersCharacterIdCalendar**](docs/CalendarApi.md#getCharactersCharacterIdCalendar) | **GET** /v1/characters/{character_id}/calendar/ | List calendar event summaries
*CalendarApi* | [**getCharactersCharacterIdCalendarEventId**](docs/CalendarApi.md#getCharactersCharacterIdCalendarEventId) | **GET** /v3/characters/{character_id}/calendar/{event_id}/ | Get an event
*CalendarApi* | [**getCharactersCharacterIdCalendarEventIdAttendees**](docs/CalendarApi.md#getCharactersCharacterIdCalendarEventIdAttendees) | **GET** /v1/characters/{character_id}/calendar/{event_id}/attendees/ | Get attendees
*CalendarApi* | [**putCharactersCharacterIdCalendarEventId**](docs/CalendarApi.md#putCharactersCharacterIdCalendarEventId) | **PUT** /v3/characters/{character_id}/calendar/{event_id}/ | Respond to an event
*CharacterApi* | [**getCharactersCharacterId**](docs/CharacterApi.md#getCharactersCharacterId) | **GET** /v4/characters/{character_id}/ | Get character&#39;s public information
*CharacterApi* | [**getCharactersCharacterIdAgentsResearch**](docs/CharacterApi.md#getCharactersCharacterIdAgentsResearch) | **GET** /v1/characters/{character_id}/agents_research/ | Get agents research
*CharacterApi* | [**getCharactersCharacterIdBlueprints**](docs/CharacterApi.md#getCharactersCharacterIdBlueprints) | **GET** /v2/characters/{character_id}/blueprints/ | Get blueprints
*CharacterApi* | [**getCharactersCharacterIdChatChannels**](docs/CharacterApi.md#getCharactersCharacterIdChatChannels) | **GET** /v1/characters/{character_id}/chat_channels/ | Get chat channels
*CharacterApi* | [**getCharactersCharacterIdCorporationhistory**](docs/CharacterApi.md#getCharactersCharacterIdCorporationhistory) | **GET** /v1/characters/{character_id}/corporationhistory/ | Get corporation history
*CharacterApi* | [**getCharactersCharacterIdFatigue**](docs/CharacterApi.md#getCharactersCharacterIdFatigue) | **GET** /v1/characters/{character_id}/fatigue/ | Get jump fatigue
*CharacterApi* | [**getCharactersCharacterIdMedals**](docs/CharacterApi.md#getCharactersCharacterIdMedals) | **GET** /v1/characters/{character_id}/medals/ | Get medals
*CharacterApi* | [**getCharactersCharacterIdNotifications**](docs/CharacterApi.md#getCharactersCharacterIdNotifications) | **GET** /v1/characters/{character_id}/notifications/ | Get character notifications
*CharacterApi* | [**getCharactersCharacterIdNotificationsContacts**](docs/CharacterApi.md#getCharactersCharacterIdNotificationsContacts) | **GET** /v1/characters/{character_id}/notifications/contacts/ | Get new contact notifications
*CharacterApi* | [**getCharactersCharacterIdPortrait**](docs/CharacterApi.md#getCharactersCharacterIdPortrait) | **GET** /v2/characters/{character_id}/portrait/ | Get character portraits
*CharacterApi* | [**getCharactersCharacterIdRoles**](docs/CharacterApi.md#getCharactersCharacterIdRoles) | **GET** /v1/characters/{character_id}/roles/ | Get character corporation roles
*CharacterApi* | [**getCharactersCharacterIdStandings**](docs/CharacterApi.md#getCharactersCharacterIdStandings) | **GET** /v1/characters/{character_id}/standings/ | Get standings
*CharacterApi* | [**getCharactersNames**](docs/CharacterApi.md#getCharactersNames) | **GET** /v1/characters/names/ | Get character names
*CharacterApi* | [**postCharactersAffiliation**](docs/CharacterApi.md#postCharactersAffiliation) | **POST** /v1/characters/affiliation/ | Character affiliation
*CharacterApi* | [**postCharactersCharacterIdCspa**](docs/CharacterApi.md#postCharactersCharacterIdCspa) | **POST** /v3/characters/{character_id}/cspa/ | Calculate a CSPA charge cost
*ClonesApi* | [**getCharactersCharacterIdClones**](docs/ClonesApi.md#getCharactersCharacterIdClones) | **GET** /v2/characters/{character_id}/clones/ | Get clones
*ClonesApi* | [**getCharactersCharacterIdImplants**](docs/ClonesApi.md#getCharactersCharacterIdImplants) | **GET** /v1/characters/{character_id}/implants/ | Get active implants
*ContactsApi* | [**deleteCharactersCharacterIdContacts**](docs/ContactsApi.md#deleteCharactersCharacterIdContacts) | **DELETE** /v1/characters/{character_id}/contacts/ | Delete contacts
*ContactsApi* | [**getCharactersCharacterIdContacts**](docs/ContactsApi.md#getCharactersCharacterIdContacts) | **GET** /v1/characters/{character_id}/contacts/ | Get contacts
*ContactsApi* | [**getCharactersCharacterIdContactsLabels**](docs/ContactsApi.md#getCharactersCharacterIdContactsLabels) | **GET** /v1/characters/{character_id}/contacts/labels/ | Get contact labels
*ContactsApi* | [**getCorporationsCorporationIdContacts**](docs/ContactsApi.md#getCorporationsCorporationIdContacts) | **GET** /v1/corporations/{corporation_id}/contacts/ | Get corporation contacts
*ContactsApi* | [**postCharactersCharacterIdContacts**](docs/ContactsApi.md#postCharactersCharacterIdContacts) | **POST** /v1/characters/{character_id}/contacts/ | Add contacts
*ContactsApi* | [**putCharactersCharacterIdContacts**](docs/ContactsApi.md#putCharactersCharacterIdContacts) | **PUT** /v1/characters/{character_id}/contacts/ | Edit contacts
*ContractsApi* | [**getCharactersCharacterIdContracts**](docs/ContractsApi.md#getCharactersCharacterIdContracts) | **GET** /v1/characters/{character_id}/contracts/ | Get contracts
*ContractsApi* | [**getCharactersCharacterIdContractsContractIdBids**](docs/ContractsApi.md#getCharactersCharacterIdContractsContractIdBids) | **GET** /v1/characters/{character_id}/contracts/{contract_id}/bids/ | Get contract bids
*ContractsApi* | [**getCharactersCharacterIdContractsContractIdItems**](docs/ContractsApi.md#getCharactersCharacterIdContractsContractIdItems) | **GET** /v1/characters/{character_id}/contracts/{contract_id}/items/ | Get contract items
*CorporationApi* | [**getCorporationsCorporationId**](docs/CorporationApi.md#getCorporationsCorporationId) | **GET** /v3/corporations/{corporation_id}/ | Get corporation information
*CorporationApi* | [**getCorporationsCorporationIdAlliancehistory**](docs/CorporationApi.md#getCorporationsCorporationIdAlliancehistory) | **GET** /v2/corporations/{corporation_id}/alliancehistory/ | Get alliance history
*CorporationApi* | [**getCorporationsCorporationIdBlueprints**](docs/CorporationApi.md#getCorporationsCorporationIdBlueprints) | **GET** /v1/corporations/{corporation_id}/blueprints/ | Get corporation blueprints
*CorporationApi* | [**getCorporationsCorporationIdDivisions**](docs/CorporationApi.md#getCorporationsCorporationIdDivisions) | **GET** /v1/corporations/{corporation_id}/divisions/ | Get corporation divisions
*CorporationApi* | [**getCorporationsCorporationIdIcons**](docs/CorporationApi.md#getCorporationsCorporationIdIcons) | **GET** /v1/corporations/{corporation_id}/icons/ | Get corporation icon
*CorporationApi* | [**getCorporationsCorporationIdMembers**](docs/CorporationApi.md#getCorporationsCorporationIdMembers) | **GET** /v2/corporations/{corporation_id}/members/ | Get corporation members
*CorporationApi* | [**getCorporationsCorporationIdMembersLimit**](docs/CorporationApi.md#getCorporationsCorporationIdMembersLimit) | **GET** /v1/corporations/{corporation_id}/members/limit/ | Get corporation member limit
*CorporationApi* | [**getCorporationsCorporationIdMembertracking**](docs/CorporationApi.md#getCorporationsCorporationIdMembertracking) | **GET** /v1/corporations/{corporation_id}/membertracking/ | Track corporation members
*CorporationApi* | [**getCorporationsCorporationIdRoles**](docs/CorporationApi.md#getCorporationsCorporationIdRoles) | **GET** /v1/corporations/{corporation_id}/roles/ | Get corporation member roles
*CorporationApi* | [**getCorporationsCorporationIdStructures**](docs/CorporationApi.md#getCorporationsCorporationIdStructures) | **GET** /v1/corporations/{corporation_id}/structures/ | Get corporation structures
*CorporationApi* | [**getCorporationsCorporationIdTitles**](docs/CorporationApi.md#getCorporationsCorporationIdTitles) | **GET** /v1/corporations/{corporation_id}/titles/ | Get corporation titles
*CorporationApi* | [**getCorporationsNames**](docs/CorporationApi.md#getCorporationsNames) | **GET** /v1/corporations/names/ | Get corporation names
*CorporationApi* | [**getCorporationsNpccorps**](docs/CorporationApi.md#getCorporationsNpccorps) | **GET** /v1/corporations/npccorps/ | Get npc corporations
*CorporationApi* | [**putCorporationsCorporationIdStructuresStructureId**](docs/CorporationApi.md#putCorporationsCorporationIdStructuresStructureId) | **PUT** /v1/corporations/{corporation_id}/structures/{structure_id}/ | Update structure vulnerability schedule
*DogmaApi* | [**getDogmaAttributes**](docs/DogmaApi.md#getDogmaAttributes) | **GET** /v1/dogma/attributes/ | Get attributes
*DogmaApi* | [**getDogmaAttributesAttributeId**](docs/DogmaApi.md#getDogmaAttributesAttributeId) | **GET** /v1/dogma/attributes/{attribute_id}/ | Get attribute information
*DogmaApi* | [**getDogmaEffects**](docs/DogmaApi.md#getDogmaEffects) | **GET** /v1/dogma/effects/ | Get effects
*DogmaApi* | [**getDogmaEffectsEffectId**](docs/DogmaApi.md#getDogmaEffectsEffectId) | **GET** /v2/dogma/effects/{effect_id}/ | Get effect information
*FactionWarfareApi* | [**getFwLeaderboards**](docs/FactionWarfareApi.md#getFwLeaderboards) | **GET** /v1/fw/leaderboards/ | List of the top factions in faction warfare
*FactionWarfareApi* | [**getFwLeaderboardsCharacters**](docs/FactionWarfareApi.md#getFwLeaderboardsCharacters) | **GET** /v1/fw/leaderboards/characters/ | List of the top pilots in faction warfare
*FactionWarfareApi* | [**getFwLeaderboardsCorporations**](docs/FactionWarfareApi.md#getFwLeaderboardsCorporations) | **GET** /v1/fw/leaderboards/corporations/ | List of the top corporations in faction warfare
*FactionWarfareApi* | [**getFwStats**](docs/FactionWarfareApi.md#getFwStats) | **GET** /v1/fw/stats/ | An overview of statistics about factions involved in faction warfare
*FactionWarfareApi* | [**getFwSystems**](docs/FactionWarfareApi.md#getFwSystems) | **GET** /v1/fw/systems/ | Ownership of faction warfare systems
*FactionWarfareApi* | [**getFwWars**](docs/FactionWarfareApi.md#getFwWars) | **GET** /v1/fw/wars/ | Data about which NPC factions are at war
*FittingsApi* | [**deleteCharactersCharacterIdFittingsFittingId**](docs/FittingsApi.md#deleteCharactersCharacterIdFittingsFittingId) | **DELETE** /v1/characters/{character_id}/fittings/{fitting_id}/ | Delete fitting
*FittingsApi* | [**getCharactersCharacterIdFittings**](docs/FittingsApi.md#getCharactersCharacterIdFittings) | **GET** /v1/characters/{character_id}/fittings/ | Get fittings
*FittingsApi* | [**postCharactersCharacterIdFittings**](docs/FittingsApi.md#postCharactersCharacterIdFittings) | **POST** /v1/characters/{character_id}/fittings/ | Create fitting
*FleetsApi* | [**deleteFleetsFleetIdMembersMemberId**](docs/FleetsApi.md#deleteFleetsFleetIdMembersMemberId) | **DELETE** /v1/fleets/{fleet_id}/members/{member_id}/ | Kick fleet member
*FleetsApi* | [**deleteFleetsFleetIdSquadsSquadId**](docs/FleetsApi.md#deleteFleetsFleetIdSquadsSquadId) | **DELETE** /v1/fleets/{fleet_id}/squads/{squad_id}/ | Delete fleet squad
*FleetsApi* | [**deleteFleetsFleetIdWingsWingId**](docs/FleetsApi.md#deleteFleetsFleetIdWingsWingId) | **DELETE** /v1/fleets/{fleet_id}/wings/{wing_id}/ | Delete fleet wing
*FleetsApi* | [**getFleetsFleetId**](docs/FleetsApi.md#getFleetsFleetId) | **GET** /v1/fleets/{fleet_id}/ | Get fleet information
*FleetsApi* | [**getFleetsFleetIdMembers**](docs/FleetsApi.md#getFleetsFleetIdMembers) | **GET** /v1/fleets/{fleet_id}/members/ | Get fleet members
*FleetsApi* | [**getFleetsFleetIdWings**](docs/FleetsApi.md#getFleetsFleetIdWings) | **GET** /v1/fleets/{fleet_id}/wings/ | Get fleet wings
*FleetsApi* | [**postFleetsFleetIdMembers**](docs/FleetsApi.md#postFleetsFleetIdMembers) | **POST** /v1/fleets/{fleet_id}/members/ | Create fleet invitation
*FleetsApi* | [**postFleetsFleetIdWings**](docs/FleetsApi.md#postFleetsFleetIdWings) | **POST** /v1/fleets/{fleet_id}/wings/ | Create fleet wing
*FleetsApi* | [**postFleetsFleetIdWingsWingIdSquads**](docs/FleetsApi.md#postFleetsFleetIdWingsWingIdSquads) | **POST** /v1/fleets/{fleet_id}/wings/{wing_id}/squads/ | Create fleet squad
*FleetsApi* | [**putFleetsFleetId**](docs/FleetsApi.md#putFleetsFleetId) | **PUT** /v1/fleets/{fleet_id}/ | Update fleet
*FleetsApi* | [**putFleetsFleetIdMembersMemberId**](docs/FleetsApi.md#putFleetsFleetIdMembersMemberId) | **PUT** /v1/fleets/{fleet_id}/members/{member_id}/ | Move fleet member
*FleetsApi* | [**putFleetsFleetIdSquadsSquadId**](docs/FleetsApi.md#putFleetsFleetIdSquadsSquadId) | **PUT** /v1/fleets/{fleet_id}/squads/{squad_id}/ | Rename fleet squad
*FleetsApi* | [**putFleetsFleetIdWingsWingId**](docs/FleetsApi.md#putFleetsFleetIdWingsWingId) | **PUT** /v1/fleets/{fleet_id}/wings/{wing_id}/ | Rename fleet wing
*IncursionsApi* | [**getIncursions**](docs/IncursionsApi.md#getIncursions) | **GET** /v1/incursions/ | List incursions
*IndustryApi* | [**getCharactersCharacterIdIndustryJobs**](docs/IndustryApi.md#getCharactersCharacterIdIndustryJobs) | **GET** /v1/characters/{character_id}/industry/jobs/ | List character industry jobs
*IndustryApi* | [**getIndustryFacilities**](docs/IndustryApi.md#getIndustryFacilities) | **GET** /v1/industry/facilities/ | List industry facilities
*IndustryApi* | [**getIndustrySystems**](docs/IndustryApi.md#getIndustrySystems) | **GET** /v1/industry/systems/ | List solar system cost indices
*InsuranceApi* | [**getInsurancePrices**](docs/InsuranceApi.md#getInsurancePrices) | **GET** /v1/insurance/prices/ | List insurance levels
*KillmailsApi* | [**getCharactersCharacterIdKillmailsRecent**](docs/KillmailsApi.md#getCharactersCharacterIdKillmailsRecent) | **GET** /v1/characters/{character_id}/killmails/recent/ | Get character kills and losses
*KillmailsApi* | [**getCorporationsCorporationIdKillmailsRecent**](docs/KillmailsApi.md#getCorporationsCorporationIdKillmailsRecent) | **GET** /v1/corporations/{corporation_id}/killmails/recent/ | Get corporation kills and losses
*KillmailsApi* | [**getKillmailsKillmailIdKillmailHash**](docs/KillmailsApi.md#getKillmailsKillmailIdKillmailHash) | **GET** /v1/killmails/{killmail_id}/{killmail_hash}/ | Get a single killmail
*LocationApi* | [**getCharactersCharacterIdLocation**](docs/LocationApi.md#getCharactersCharacterIdLocation) | **GET** /v1/characters/{character_id}/location/ | Get character location
*LocationApi* | [**getCharactersCharacterIdOnline**](docs/LocationApi.md#getCharactersCharacterIdOnline) | **GET** /v1/characters/{character_id}/online/ | Get character online
*LocationApi* | [**getCharactersCharacterIdShip**](docs/LocationApi.md#getCharactersCharacterIdShip) | **GET** /v1/characters/{character_id}/ship/ | Get current ship
*LoyaltyApi* | [**getCharactersCharacterIdLoyaltyPoints**](docs/LoyaltyApi.md#getCharactersCharacterIdLoyaltyPoints) | **GET** /v1/characters/{character_id}/loyalty/points/ | Get loyalty points
*LoyaltyApi* | [**getLoyaltyStoresCorporationIdOffers**](docs/LoyaltyApi.md#getLoyaltyStoresCorporationIdOffers) | **GET** /v1/loyalty/stores/{corporation_id}/offers/ | List loyalty store offers
*MailApi* | [**deleteCharactersCharacterIdMailLabelsLabelId**](docs/MailApi.md#deleteCharactersCharacterIdMailLabelsLabelId) | **DELETE** /v1/characters/{character_id}/mail/labels/{label_id}/ | Delete a mail label
*MailApi* | [**deleteCharactersCharacterIdMailMailId**](docs/MailApi.md#deleteCharactersCharacterIdMailMailId) | **DELETE** /v1/characters/{character_id}/mail/{mail_id}/ | Delete a mail
*MailApi* | [**getCharactersCharacterIdMail**](docs/MailApi.md#getCharactersCharacterIdMail) | **GET** /v1/characters/{character_id}/mail/ | Return mail headers
*MailApi* | [**getCharactersCharacterIdMailLabels**](docs/MailApi.md#getCharactersCharacterIdMailLabels) | **GET** /v3/characters/{character_id}/mail/labels/ | Get mail labels and unread counts
*MailApi* | [**getCharactersCharacterIdMailLists**](docs/MailApi.md#getCharactersCharacterIdMailLists) | **GET** /v1/characters/{character_id}/mail/lists/ | Return mailing list subscriptions
*MailApi* | [**getCharactersCharacterIdMailMailId**](docs/MailApi.md#getCharactersCharacterIdMailMailId) | **GET** /v1/characters/{character_id}/mail/{mail_id}/ | Return a mail
*MailApi* | [**postCharactersCharacterIdMail**](docs/MailApi.md#postCharactersCharacterIdMail) | **POST** /v1/characters/{character_id}/mail/ | Send a new mail
*MailApi* | [**postCharactersCharacterIdMailLabels**](docs/MailApi.md#postCharactersCharacterIdMailLabels) | **POST** /v2/characters/{character_id}/mail/labels/ | Create a mail label
*MailApi* | [**putCharactersCharacterIdMailMailId**](docs/MailApi.md#putCharactersCharacterIdMailMailId) | **PUT** /v1/characters/{character_id}/mail/{mail_id}/ | Update metadata about a mail
*MarketApi* | [**getCharactersCharacterIdOrders**](docs/MarketApi.md#getCharactersCharacterIdOrders) | **GET** /v1/characters/{character_id}/orders/ | List orders from a character
*MarketApi* | [**getMarketsGroups**](docs/MarketApi.md#getMarketsGroups) | **GET** /v1/markets/groups/ | Get item groups
*MarketApi* | [**getMarketsGroupsMarketGroupId**](docs/MarketApi.md#getMarketsGroupsMarketGroupId) | **GET** /v1/markets/groups/{market_group_id}/ | Get item group information
*MarketApi* | [**getMarketsPrices**](docs/MarketApi.md#getMarketsPrices) | **GET** /v1/markets/prices/ | List market prices
*MarketApi* | [**getMarketsRegionIdHistory**](docs/MarketApi.md#getMarketsRegionIdHistory) | **GET** /v1/markets/{region_id}/history/ | List historical market statistics in a region
*MarketApi* | [**getMarketsRegionIdOrders**](docs/MarketApi.md#getMarketsRegionIdOrders) | **GET** /v1/markets/{region_id}/orders/ | List orders in a region
*MarketApi* | [**getMarketsRegionIdTypes**](docs/MarketApi.md#getMarketsRegionIdTypes) | **GET** /v1/markets/{region_id}/types/ | List type IDs relevant to a market
*MarketApi* | [**getMarketsStructuresStructureId**](docs/MarketApi.md#getMarketsStructuresStructureId) | **GET** /v1/markets/structures/{structure_id}/ | List orders in a structure
*OpportunitiesApi* | [**getCharactersCharacterIdOpportunities**](docs/OpportunitiesApi.md#getCharactersCharacterIdOpportunities) | **GET** /v1/characters/{character_id}/opportunities/ | Get a character&#39;s completed tasks
*OpportunitiesApi* | [**getOpportunitiesGroups**](docs/OpportunitiesApi.md#getOpportunitiesGroups) | **GET** /v1/opportunities/groups/ | Get opportunities groups
*OpportunitiesApi* | [**getOpportunitiesGroupsGroupId**](docs/OpportunitiesApi.md#getOpportunitiesGroupsGroupId) | **GET** /v1/opportunities/groups/{group_id}/ | Get opportunities group
*OpportunitiesApi* | [**getOpportunitiesTasks**](docs/OpportunitiesApi.md#getOpportunitiesTasks) | **GET** /v1/opportunities/tasks/ | Get opportunities tasks
*OpportunitiesApi* | [**getOpportunitiesTasksTaskId**](docs/OpportunitiesApi.md#getOpportunitiesTasksTaskId) | **GET** /v1/opportunities/tasks/{task_id}/ | Get opportunities task
*PlanetaryInteractionApi* | [**getCharactersCharacterIdPlanets**](docs/PlanetaryInteractionApi.md#getCharactersCharacterIdPlanets) | **GET** /v1/characters/{character_id}/planets/ | Get colonies
*PlanetaryInteractionApi* | [**getCharactersCharacterIdPlanetsPlanetId**](docs/PlanetaryInteractionApi.md#getCharactersCharacterIdPlanetsPlanetId) | **GET** /v3/characters/{character_id}/planets/{planet_id}/ | Get colony layout
*PlanetaryInteractionApi* | [**getUniverseSchematicsSchematicId**](docs/PlanetaryInteractionApi.md#getUniverseSchematicsSchematicId) | **GET** /v1/universe/schematics/{schematic_id}/ | Get schematic information
*RoutesApi* | [**getRouteOriginDestination**](docs/RoutesApi.md#getRouteOriginDestination) | **GET** /v1/route/{origin}/{destination}/ | Get route
*SearchApi* | [**getCharactersCharacterIdSearch**](docs/SearchApi.md#getCharactersCharacterIdSearch) | **GET** /v2/characters/{character_id}/search/ | Search on a string
*SearchApi* | [**getSearch**](docs/SearchApi.md#getSearch) | **GET** /v1/search/ | Search on a string
*SkillsApi* | [**getCharactersCharacterIdAttributes**](docs/SkillsApi.md#getCharactersCharacterIdAttributes) | **GET** /v1/characters/{character_id}/attributes/ | Get character attributes
*SkillsApi* | [**getCharactersCharacterIdSkillqueue**](docs/SkillsApi.md#getCharactersCharacterIdSkillqueue) | **GET** /v2/characters/{character_id}/skillqueue/ | Get character&#39;s skill queue
*SkillsApi* | [**getCharactersCharacterIdSkills**](docs/SkillsApi.md#getCharactersCharacterIdSkills) | **GET** /v3/characters/{character_id}/skills/ | Get character skills
*SovereigntyApi* | [**getSovereigntyCampaigns**](docs/SovereigntyApi.md#getSovereigntyCampaigns) | **GET** /v1/sovereignty/campaigns/ | List sovereignty campaigns
*SovereigntyApi* | [**getSovereigntyMap**](docs/SovereigntyApi.md#getSovereigntyMap) | **GET** /v1/sovereignty/map/ | List sovereignty of systems
*SovereigntyApi* | [**getSovereigntyStructures**](docs/SovereigntyApi.md#getSovereigntyStructures) | **GET** /v1/sovereignty/structures/ | List sovereignty structures
*StatusApi* | [**getStatus**](docs/StatusApi.md#getStatus) | **GET** /v1/status/ | Retrieve the uptime and player counts
*UniverseApi* | [**getUniverseBloodlines**](docs/UniverseApi.md#getUniverseBloodlines) | **GET** /v1/universe/bloodlines/ | Get bloodlines
*UniverseApi* | [**getUniverseCategories**](docs/UniverseApi.md#getUniverseCategories) | **GET** /v1/universe/categories/ | Get item categories
*UniverseApi* | [**getUniverseCategoriesCategoryId**](docs/UniverseApi.md#getUniverseCategoriesCategoryId) | **GET** /v1/universe/categories/{category_id}/ | Get item category information
*UniverseApi* | [**getUniverseConstellations**](docs/UniverseApi.md#getUniverseConstellations) | **GET** /v1/universe/constellations/ | Get constellations
*UniverseApi* | [**getUniverseConstellationsConstellationId**](docs/UniverseApi.md#getUniverseConstellationsConstellationId) | **GET** /v1/universe/constellations/{constellation_id}/ | Get constellation information
*UniverseApi* | [**getUniverseFactions**](docs/UniverseApi.md#getUniverseFactions) | **GET** /v1/universe/factions/ | Get factions
*UniverseApi* | [**getUniverseGraphics**](docs/UniverseApi.md#getUniverseGraphics) | **GET** /v1/universe/graphics/ | Get graphics
*UniverseApi* | [**getUniverseGraphicsGraphicId**](docs/UniverseApi.md#getUniverseGraphicsGraphicId) | **GET** /v1/universe/graphics/{graphic_id}/ | Get graphic information
*UniverseApi* | [**getUniverseGroups**](docs/UniverseApi.md#getUniverseGroups) | **GET** /v1/universe/groups/ | Get item groups
*UniverseApi* | [**getUniverseGroupsGroupId**](docs/UniverseApi.md#getUniverseGroupsGroupId) | **GET** /v1/universe/groups/{group_id}/ | Get item group information
*UniverseApi* | [**getUniverseMoonsMoonId**](docs/UniverseApi.md#getUniverseMoonsMoonId) | **GET** /v1/universe/moons/{moon_id}/ | Get moon information
*UniverseApi* | [**getUniversePlanetsPlanetId**](docs/UniverseApi.md#getUniversePlanetsPlanetId) | **GET** /v1/universe/planets/{planet_id}/ | Get planet information
*UniverseApi* | [**getUniverseRaces**](docs/UniverseApi.md#getUniverseRaces) | **GET** /v1/universe/races/ | Get character races
*UniverseApi* | [**getUniverseRegions**](docs/UniverseApi.md#getUniverseRegions) | **GET** /v1/universe/regions/ | Get regions
*UniverseApi* | [**getUniverseRegionsRegionId**](docs/UniverseApi.md#getUniverseRegionsRegionId) | **GET** /v1/universe/regions/{region_id}/ | Get region information
*UniverseApi* | [**getUniverseStargatesStargateId**](docs/UniverseApi.md#getUniverseStargatesStargateId) | **GET** /v1/universe/stargates/{stargate_id}/ | Get stargate information
*UniverseApi* | [**getUniverseStarsStarId**](docs/UniverseApi.md#getUniverseStarsStarId) | **GET** /v1/universe/stars/{star_id}/ | Get star information
*UniverseApi* | [**getUniverseStationsStationId**](docs/UniverseApi.md#getUniverseStationsStationId) | **GET** /v2/universe/stations/{station_id}/ | Get station information
*UniverseApi* | [**getUniverseStructures**](docs/UniverseApi.md#getUniverseStructures) | **GET** /v1/universe/structures/ | List all public structures
*UniverseApi* | [**getUniverseStructuresStructureId**](docs/UniverseApi.md#getUniverseStructuresStructureId) | **GET** /v1/universe/structures/{structure_id}/ | Get structure information
*UniverseApi* | [**getUniverseSystemJumps**](docs/UniverseApi.md#getUniverseSystemJumps) | **GET** /v1/universe/system_jumps/ | Get system jumps
*UniverseApi* | [**getUniverseSystemKills**](docs/UniverseApi.md#getUniverseSystemKills) | **GET** /v2/universe/system_kills/ | Get system kills
*UniverseApi* | [**getUniverseSystems**](docs/UniverseApi.md#getUniverseSystems) | **GET** /v1/universe/systems/ | Get solar systems
*UniverseApi* | [**getUniverseSystemsSystemId**](docs/UniverseApi.md#getUniverseSystemsSystemId) | **GET** /v3/universe/systems/{system_id}/ | Get solar system information
*UniverseApi* | [**getUniverseTypes**](docs/UniverseApi.md#getUniverseTypes) | **GET** /v1/universe/types/ | Get types
*UniverseApi* | [**getUniverseTypesTypeId**](docs/UniverseApi.md#getUniverseTypesTypeId) | **GET** /v3/universe/types/{type_id}/ | Get type information
*UniverseApi* | [**postUniverseNames**](docs/UniverseApi.md#postUniverseNames) | **POST** /v2/universe/names/ | Get names and categories for a set of ID&#39;s
*UserInterfaceApi* | [**postUiAutopilotWaypoint**](docs/UserInterfaceApi.md#postUiAutopilotWaypoint) | **POST** /v2/ui/autopilot/waypoint/ | Set Autopilot Waypoint
*UserInterfaceApi* | [**postUiOpenwindowContract**](docs/UserInterfaceApi.md#postUiOpenwindowContract) | **POST** /v1/ui/openwindow/contract/ | Open Contract Window
*UserInterfaceApi* | [**postUiOpenwindowInformation**](docs/UserInterfaceApi.md#postUiOpenwindowInformation) | **POST** /v1/ui/openwindow/information/ | Open Information Window
*UserInterfaceApi* | [**postUiOpenwindowMarketdetails**](docs/UserInterfaceApi.md#postUiOpenwindowMarketdetails) | **POST** /v1/ui/openwindow/marketdetails/ | Open Market Details
*UserInterfaceApi* | [**postUiOpenwindowNewmail**](docs/UserInterfaceApi.md#postUiOpenwindowNewmail) | **POST** /v1/ui/openwindow/newmail/ | Open New Mail Window
*WalletApi* | [**getCharactersCharacterIdWallet**](docs/WalletApi.md#getCharactersCharacterIdWallet) | **GET** /v1/characters/{character_id}/wallet/ | Get a character&#39;s wallet balance
*WalletApi* | [**getCharactersCharacterIdWalletJournal**](docs/WalletApi.md#getCharactersCharacterIdWalletJournal) | **GET** /v2/characters/{character_id}/wallet/journal/ | Get character wallet journal
*WalletApi* | [**getCharactersCharacterIdWalletTransactions**](docs/WalletApi.md#getCharactersCharacterIdWalletTransactions) | **GET** /v1/characters/{character_id}/wallet/transactions/ | Get wallet transactions
*WalletApi* | [**getCorporationsCorporationIdWallets**](docs/WalletApi.md#getCorporationsCorporationIdWallets) | **GET** /v1/corporations/{corporation_id}/wallets/ | Returns a corporation&#39;s wallet balance
*WalletApi* | [**getCorporationsCorporationIdWalletsDivisionJournal**](docs/WalletApi.md#getCorporationsCorporationIdWalletsDivisionJournal) | **GET** /v1/corporations/{corporation_id}/wallets/{division}/journal/ | Get corporation wallet journal
*WalletApi* | [**getCorporationsCorporationIdWalletsDivisionTransactions**](docs/WalletApi.md#getCorporationsCorporationIdWalletsDivisionTransactions) | **GET** /v1/corporations/{corporation_id}/wallets/{division}/transactions/ | Get corporation wallet transactions
*WarsApi* | [**getWars**](docs/WarsApi.md#getWars) | **GET** /v1/wars/ | List wars
*WarsApi* | [**getWarsWarId**](docs/WarsApi.md#getWarsWarId) | **GET** /v1/wars/{war_id}/ | Get war information
*WarsApi* | [**getWarsWarIdKillmails**](docs/WarsApi.md#getWarsWarIdKillmails) | **GET** /v1/wars/{war_id}/killmails/ | List kills for a war


## Documentation for Models

 - [DeleteCharactersCharacterIdMailLabelsLabelIdUnprocessableEntity](docs/DeleteCharactersCharacterIdMailLabelsLabelIdUnprocessableEntity.md)
 - [DeleteFleetsFleetIdMembersMemberIdNotFound](docs/DeleteFleetsFleetIdMembersMemberIdNotFound.md)
 - [DeleteFleetsFleetIdSquadsSquadIdNotFound](docs/DeleteFleetsFleetIdSquadsSquadIdNotFound.md)
 - [DeleteFleetsFleetIdWingsWingIdNotFound](docs/DeleteFleetsFleetIdWingsWingIdNotFound.md)
 - [Forbidden](docs/Forbidden.md)
 - [GetAlliancesAllianceIdIconsNotFound](docs/GetAlliancesAllianceIdIconsNotFound.md)
 - [GetAlliancesAllianceIdIconsOk](docs/GetAlliancesAllianceIdIconsOk.md)
 - [GetAlliancesAllianceIdNotFound](docs/GetAlliancesAllianceIdNotFound.md)
 - [GetAlliancesAllianceIdOk](docs/GetAlliancesAllianceIdOk.md)
 - [GetAlliancesNames200Ok](docs/GetAlliancesNames200Ok.md)
 - [GetCharactersCharacterIdAgentsResearch200Ok](docs/GetCharactersCharacterIdAgentsResearch200Ok.md)
 - [GetCharactersCharacterIdAssets200Ok](docs/GetCharactersCharacterIdAssets200Ok.md)
 - [GetCharactersCharacterIdAttributesOk](docs/GetCharactersCharacterIdAttributesOk.md)
 - [GetCharactersCharacterIdBlueprints200Ok](docs/GetCharactersCharacterIdBlueprints200Ok.md)
 - [GetCharactersCharacterIdBookmarks200Ok](docs/GetCharactersCharacterIdBookmarks200Ok.md)
 - [GetCharactersCharacterIdBookmarksCoordinates](docs/GetCharactersCharacterIdBookmarksCoordinates.md)
 - [GetCharactersCharacterIdBookmarksFolders200Ok](docs/GetCharactersCharacterIdBookmarksFolders200Ok.md)
 - [GetCharactersCharacterIdBookmarksItem](docs/GetCharactersCharacterIdBookmarksItem.md)
 - [GetCharactersCharacterIdBookmarksTarget](docs/GetCharactersCharacterIdBookmarksTarget.md)
 - [GetCharactersCharacterIdCalendar200Ok](docs/GetCharactersCharacterIdCalendar200Ok.md)
 - [GetCharactersCharacterIdCalendarEventIdAttendees200Ok](docs/GetCharactersCharacterIdCalendarEventIdAttendees200Ok.md)
 - [GetCharactersCharacterIdCalendarEventIdOk](docs/GetCharactersCharacterIdCalendarEventIdOk.md)
 - [GetCharactersCharacterIdChatChannels200Ok](docs/GetCharactersCharacterIdChatChannels200Ok.md)
 - [GetCharactersCharacterIdChatChannelsAllowed](docs/GetCharactersCharacterIdChatChannelsAllowed.md)
 - [GetCharactersCharacterIdChatChannelsBlocked](docs/GetCharactersCharacterIdChatChannelsBlocked.md)
 - [GetCharactersCharacterIdChatChannelsMuted](docs/GetCharactersCharacterIdChatChannelsMuted.md)
 - [GetCharactersCharacterIdChatChannelsOperator](docs/GetCharactersCharacterIdChatChannelsOperator.md)
 - [GetCharactersCharacterIdClonesHomeLocation](docs/GetCharactersCharacterIdClonesHomeLocation.md)
 - [GetCharactersCharacterIdClonesJumpClone](docs/GetCharactersCharacterIdClonesJumpClone.md)
 - [GetCharactersCharacterIdClonesOk](docs/GetCharactersCharacterIdClonesOk.md)
 - [GetCharactersCharacterIdContacts200Ok](docs/GetCharactersCharacterIdContacts200Ok.md)
 - [GetCharactersCharacterIdContactsLabels200Ok](docs/GetCharactersCharacterIdContactsLabels200Ok.md)
 - [GetCharactersCharacterIdContracts200Ok](docs/GetCharactersCharacterIdContracts200Ok.md)
 - [GetCharactersCharacterIdContractsContractIdBids200Ok](docs/GetCharactersCharacterIdContractsContractIdBids200Ok.md)
 - [GetCharactersCharacterIdContractsContractIdItems200Ok](docs/GetCharactersCharacterIdContractsContractIdItems200Ok.md)
 - [GetCharactersCharacterIdCorporationhistory200Ok](docs/GetCharactersCharacterIdCorporationhistory200Ok.md)
 - [GetCharactersCharacterIdFatigueOk](docs/GetCharactersCharacterIdFatigueOk.md)
 - [GetCharactersCharacterIdFittings200Ok](docs/GetCharactersCharacterIdFittings200Ok.md)
 - [GetCharactersCharacterIdFittingsItem](docs/GetCharactersCharacterIdFittingsItem.md)
 - [GetCharactersCharacterIdIndustryJobs200Ok](docs/GetCharactersCharacterIdIndustryJobs200Ok.md)
 - [GetCharactersCharacterIdKillmailsRecent200Ok](docs/GetCharactersCharacterIdKillmailsRecent200Ok.md)
 - [GetCharactersCharacterIdLocationOk](docs/GetCharactersCharacterIdLocationOk.md)
 - [GetCharactersCharacterIdLoyaltyPoints200Ok](docs/GetCharactersCharacterIdLoyaltyPoints200Ok.md)
 - [GetCharactersCharacterIdMail200Ok](docs/GetCharactersCharacterIdMail200Ok.md)
 - [GetCharactersCharacterIdMailLabelsLabel](docs/GetCharactersCharacterIdMailLabelsLabel.md)
 - [GetCharactersCharacterIdMailLabelsOk](docs/GetCharactersCharacterIdMailLabelsOk.md)
 - [GetCharactersCharacterIdMailLists200Ok](docs/GetCharactersCharacterIdMailLists200Ok.md)
 - [GetCharactersCharacterIdMailMailIdNotFound](docs/GetCharactersCharacterIdMailMailIdNotFound.md)
 - [GetCharactersCharacterIdMailMailIdOk](docs/GetCharactersCharacterIdMailMailIdOk.md)
 - [GetCharactersCharacterIdMailMailIdRecipient](docs/GetCharactersCharacterIdMailMailIdRecipient.md)
 - [GetCharactersCharacterIdMailRecipient](docs/GetCharactersCharacterIdMailRecipient.md)
 - [GetCharactersCharacterIdMedals200Ok](docs/GetCharactersCharacterIdMedals200Ok.md)
 - [GetCharactersCharacterIdMedalsGraphic](docs/GetCharactersCharacterIdMedalsGraphic.md)
 - [GetCharactersCharacterIdNotFound](docs/GetCharactersCharacterIdNotFound.md)
 - [GetCharactersCharacterIdNotifications200Ok](docs/GetCharactersCharacterIdNotifications200Ok.md)
 - [GetCharactersCharacterIdNotificationsContacts200Ok](docs/GetCharactersCharacterIdNotificationsContacts200Ok.md)
 - [GetCharactersCharacterIdOk](docs/GetCharactersCharacterIdOk.md)
 - [GetCharactersCharacterIdOpportunities200Ok](docs/GetCharactersCharacterIdOpportunities200Ok.md)
 - [GetCharactersCharacterIdOrders200Ok](docs/GetCharactersCharacterIdOrders200Ok.md)
 - [GetCharactersCharacterIdPlanets200Ok](docs/GetCharactersCharacterIdPlanets200Ok.md)
 - [GetCharactersCharacterIdPlanetsPlanetIdContent](docs/GetCharactersCharacterIdPlanetsPlanetIdContent.md)
 - [GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails](docs/GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails.md)
 - [GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails](docs/GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails.md)
 - [GetCharactersCharacterIdPlanetsPlanetIdHead](docs/GetCharactersCharacterIdPlanetsPlanetIdHead.md)
 - [GetCharactersCharacterIdPlanetsPlanetIdLink](docs/GetCharactersCharacterIdPlanetsPlanetIdLink.md)
 - [GetCharactersCharacterIdPlanetsPlanetIdNotFound](docs/GetCharactersCharacterIdPlanetsPlanetIdNotFound.md)
 - [GetCharactersCharacterIdPlanetsPlanetIdOk](docs/GetCharactersCharacterIdPlanetsPlanetIdOk.md)
 - [GetCharactersCharacterIdPlanetsPlanetIdPin](docs/GetCharactersCharacterIdPlanetsPlanetIdPin.md)
 - [GetCharactersCharacterIdPlanetsPlanetIdRoute](docs/GetCharactersCharacterIdPlanetsPlanetIdRoute.md)
 - [GetCharactersCharacterIdPortraitNotFound](docs/GetCharactersCharacterIdPortraitNotFound.md)
 - [GetCharactersCharacterIdPortraitOk](docs/GetCharactersCharacterIdPortraitOk.md)
 - [GetCharactersCharacterIdSearchOk](docs/GetCharactersCharacterIdSearchOk.md)
 - [GetCharactersCharacterIdShipOk](docs/GetCharactersCharacterIdShipOk.md)
 - [GetCharactersCharacterIdSkillqueue200Ok](docs/GetCharactersCharacterIdSkillqueue200Ok.md)
 - [GetCharactersCharacterIdSkillsOk](docs/GetCharactersCharacterIdSkillsOk.md)
 - [GetCharactersCharacterIdSkillsSkill](docs/GetCharactersCharacterIdSkillsSkill.md)
 - [GetCharactersCharacterIdStandings200Ok](docs/GetCharactersCharacterIdStandings200Ok.md)
 - [GetCharactersCharacterIdWalletJournal200Ok](docs/GetCharactersCharacterIdWalletJournal200Ok.md)
 - [GetCharactersCharacterIdWalletJournalExtraInfo](docs/GetCharactersCharacterIdWalletJournalExtraInfo.md)
 - [GetCharactersCharacterIdWalletTransactions200Ok](docs/GetCharactersCharacterIdWalletTransactions200Ok.md)
 - [GetCharactersNames200Ok](docs/GetCharactersNames200Ok.md)
 - [GetCorporationsCorporationIdAlliancehistory200Ok](docs/GetCorporationsCorporationIdAlliancehistory200Ok.md)
 - [GetCorporationsCorporationIdAssets200Ok](docs/GetCorporationsCorporationIdAssets200Ok.md)
 - [GetCorporationsCorporationIdBlueprints200Ok](docs/GetCorporationsCorporationIdBlueprints200Ok.md)
 - [GetCorporationsCorporationIdBookmarks200Ok](docs/GetCorporationsCorporationIdBookmarks200Ok.md)
 - [GetCorporationsCorporationIdBookmarksCoordinates](docs/GetCorporationsCorporationIdBookmarksCoordinates.md)
 - [GetCorporationsCorporationIdBookmarksFolders200Ok](docs/GetCorporationsCorporationIdBookmarksFolders200Ok.md)
 - [GetCorporationsCorporationIdBookmarksItem](docs/GetCorporationsCorporationIdBookmarksItem.md)
 - [GetCorporationsCorporationIdContacts200Ok](docs/GetCorporationsCorporationIdContacts200Ok.md)
 - [GetCorporationsCorporationIdDivisionsHangar](docs/GetCorporationsCorporationIdDivisionsHangar.md)
 - [GetCorporationsCorporationIdDivisionsOk](docs/GetCorporationsCorporationIdDivisionsOk.md)
 - [GetCorporationsCorporationIdDivisionsWallet](docs/GetCorporationsCorporationIdDivisionsWallet.md)
 - [GetCorporationsCorporationIdIconsNotFound](docs/GetCorporationsCorporationIdIconsNotFound.md)
 - [GetCorporationsCorporationIdIconsOk](docs/GetCorporationsCorporationIdIconsOk.md)
 - [GetCorporationsCorporationIdKillmailsRecent200Ok](docs/GetCorporationsCorporationIdKillmailsRecent200Ok.md)
 - [GetCorporationsCorporationIdMembers200Ok](docs/GetCorporationsCorporationIdMembers200Ok.md)
 - [GetCorporationsCorporationIdMembertracking200Ok](docs/GetCorporationsCorporationIdMembertracking200Ok.md)
 - [GetCorporationsCorporationIdNotFound](docs/GetCorporationsCorporationIdNotFound.md)
 - [GetCorporationsCorporationIdOk](docs/GetCorporationsCorporationIdOk.md)
 - [GetCorporationsCorporationIdRoles200Ok](docs/GetCorporationsCorporationIdRoles200Ok.md)
 - [GetCorporationsCorporationIdStructures200Ok](docs/GetCorporationsCorporationIdStructures200Ok.md)
 - [GetCorporationsCorporationIdStructuresCurrentVul](docs/GetCorporationsCorporationIdStructuresCurrentVul.md)
 - [GetCorporationsCorporationIdStructuresNextVul](docs/GetCorporationsCorporationIdStructuresNextVul.md)
 - [GetCorporationsCorporationIdStructuresService](docs/GetCorporationsCorporationIdStructuresService.md)
 - [GetCorporationsCorporationIdTitles200Ok](docs/GetCorporationsCorporationIdTitles200Ok.md)
 - [GetCorporationsCorporationIdWallets200Ok](docs/GetCorporationsCorporationIdWallets200Ok.md)
 - [GetCorporationsCorporationIdWalletsDivisionJournal200Ok](docs/GetCorporationsCorporationIdWalletsDivisionJournal200Ok.md)
 - [GetCorporationsCorporationIdWalletsDivisionJournalExtraInfo](docs/GetCorporationsCorporationIdWalletsDivisionJournalExtraInfo.md)
 - [GetCorporationsCorporationIdWalletsDivisionTransactions200Ok](docs/GetCorporationsCorporationIdWalletsDivisionTransactions200Ok.md)
 - [GetCorporationsNames200Ok](docs/GetCorporationsNames200Ok.md)
 - [GetDogmaAttributesAttributeIdNotFound](docs/GetDogmaAttributesAttributeIdNotFound.md)
 - [GetDogmaAttributesAttributeIdOk](docs/GetDogmaAttributesAttributeIdOk.md)
 - [GetDogmaEffectsEffectIdModifier](docs/GetDogmaEffectsEffectIdModifier.md)
 - [GetDogmaEffectsEffectIdNotFound](docs/GetDogmaEffectsEffectIdNotFound.md)
 - [GetDogmaEffectsEffectIdOk](docs/GetDogmaEffectsEffectIdOk.md)
 - [GetFleetsFleetIdMembers200Ok](docs/GetFleetsFleetIdMembers200Ok.md)
 - [GetFleetsFleetIdMembersNotFound](docs/GetFleetsFleetIdMembersNotFound.md)
 - [GetFleetsFleetIdNotFound](docs/GetFleetsFleetIdNotFound.md)
 - [GetFleetsFleetIdOk](docs/GetFleetsFleetIdOk.md)
 - [GetFleetsFleetIdWings200Ok](docs/GetFleetsFleetIdWings200Ok.md)
 - [GetFleetsFleetIdWingsNotFound](docs/GetFleetsFleetIdWingsNotFound.md)
 - [GetFleetsFleetIdWingsSquad](docs/GetFleetsFleetIdWingsSquad.md)
 - [GetFwLeaderboardsActiveTotal](docs/GetFwLeaderboardsActiveTotal.md)
 - [GetFwLeaderboardsActiveTotal1](docs/GetFwLeaderboardsActiveTotal1.md)
 - [GetFwLeaderboardsCharactersActiveTotal](docs/GetFwLeaderboardsCharactersActiveTotal.md)
 - [GetFwLeaderboardsCharactersActiveTotal1](docs/GetFwLeaderboardsCharactersActiveTotal1.md)
 - [GetFwLeaderboardsCharactersKills](docs/GetFwLeaderboardsCharactersKills.md)
 - [GetFwLeaderboardsCharactersLastWeek](docs/GetFwLeaderboardsCharactersLastWeek.md)
 - [GetFwLeaderboardsCharactersLastWeek1](docs/GetFwLeaderboardsCharactersLastWeek1.md)
 - [GetFwLeaderboardsCharactersOk](docs/GetFwLeaderboardsCharactersOk.md)
 - [GetFwLeaderboardsCharactersVictoryPoints](docs/GetFwLeaderboardsCharactersVictoryPoints.md)
 - [GetFwLeaderboardsCharactersYesterday](docs/GetFwLeaderboardsCharactersYesterday.md)
 - [GetFwLeaderboardsCharactersYesterday1](docs/GetFwLeaderboardsCharactersYesterday1.md)
 - [GetFwLeaderboardsCorporationsActiveTotal](docs/GetFwLeaderboardsCorporationsActiveTotal.md)
 - [GetFwLeaderboardsCorporationsActiveTotal1](docs/GetFwLeaderboardsCorporationsActiveTotal1.md)
 - [GetFwLeaderboardsCorporationsKills](docs/GetFwLeaderboardsCorporationsKills.md)
 - [GetFwLeaderboardsCorporationsLastWeek](docs/GetFwLeaderboardsCorporationsLastWeek.md)
 - [GetFwLeaderboardsCorporationsLastWeek1](docs/GetFwLeaderboardsCorporationsLastWeek1.md)
 - [GetFwLeaderboardsCorporationsOk](docs/GetFwLeaderboardsCorporationsOk.md)
 - [GetFwLeaderboardsCorporationsVictoryPoints](docs/GetFwLeaderboardsCorporationsVictoryPoints.md)
 - [GetFwLeaderboardsCorporationsYesterday](docs/GetFwLeaderboardsCorporationsYesterday.md)
 - [GetFwLeaderboardsCorporationsYesterday1](docs/GetFwLeaderboardsCorporationsYesterday1.md)
 - [GetFwLeaderboardsKills](docs/GetFwLeaderboardsKills.md)
 - [GetFwLeaderboardsLastWeek](docs/GetFwLeaderboardsLastWeek.md)
 - [GetFwLeaderboardsLastWeek1](docs/GetFwLeaderboardsLastWeek1.md)
 - [GetFwLeaderboardsOk](docs/GetFwLeaderboardsOk.md)
 - [GetFwLeaderboardsVictoryPoints](docs/GetFwLeaderboardsVictoryPoints.md)
 - [GetFwLeaderboardsYesterday](docs/GetFwLeaderboardsYesterday.md)
 - [GetFwLeaderboardsYesterday1](docs/GetFwLeaderboardsYesterday1.md)
 - [GetFwStats200Ok](docs/GetFwStats200Ok.md)
 - [GetFwStatsKills](docs/GetFwStatsKills.md)
 - [GetFwStatsVictoryPoints](docs/GetFwStatsVictoryPoints.md)
 - [GetFwSystems200Ok](docs/GetFwSystems200Ok.md)
 - [GetFwWars200Ok](docs/GetFwWars200Ok.md)
 - [GetIncursions200Ok](docs/GetIncursions200Ok.md)
 - [GetIndustryFacilities200Ok](docs/GetIndustryFacilities200Ok.md)
 - [GetIndustrySystems200Ok](docs/GetIndustrySystems200Ok.md)
 - [GetIndustrySystemsCostIndice](docs/GetIndustrySystemsCostIndice.md)
 - [GetInsurancePrices200Ok](docs/GetInsurancePrices200Ok.md)
 - [GetInsurancePricesLevel](docs/GetInsurancePricesLevel.md)
 - [GetKillmailsKillmailIdKillmailHashAttacker](docs/GetKillmailsKillmailIdKillmailHashAttacker.md)
 - [GetKillmailsKillmailIdKillmailHashItem](docs/GetKillmailsKillmailIdKillmailHashItem.md)
 - [GetKillmailsKillmailIdKillmailHashItem1](docs/GetKillmailsKillmailIdKillmailHashItem1.md)
 - [GetKillmailsKillmailIdKillmailHashOk](docs/GetKillmailsKillmailIdKillmailHashOk.md)
 - [GetKillmailsKillmailIdKillmailHashPosition](docs/GetKillmailsKillmailIdKillmailHashPosition.md)
 - [GetKillmailsKillmailIdKillmailHashUnprocessableEntity](docs/GetKillmailsKillmailIdKillmailHashUnprocessableEntity.md)
 - [GetKillmailsKillmailIdKillmailHashVictim](docs/GetKillmailsKillmailIdKillmailHashVictim.md)
 - [GetLoyaltyStoresCorporationIdOffers200Ok](docs/GetLoyaltyStoresCorporationIdOffers200Ok.md)
 - [GetLoyaltyStoresCorporationIdOffersRequiredItem](docs/GetLoyaltyStoresCorporationIdOffersRequiredItem.md)
 - [GetMarketsGroupsMarketGroupIdNotFound](docs/GetMarketsGroupsMarketGroupIdNotFound.md)
 - [GetMarketsGroupsMarketGroupIdOk](docs/GetMarketsGroupsMarketGroupIdOk.md)
 - [GetMarketsPrices200Ok](docs/GetMarketsPrices200Ok.md)
 - [GetMarketsRegionIdHistory200Ok](docs/GetMarketsRegionIdHistory200Ok.md)
 - [GetMarketsRegionIdHistoryUnprocessableEntity](docs/GetMarketsRegionIdHistoryUnprocessableEntity.md)
 - [GetMarketsRegionIdOrders200Ok](docs/GetMarketsRegionIdOrders200Ok.md)
 - [GetMarketsRegionIdOrdersUnprocessableEntity](docs/GetMarketsRegionIdOrdersUnprocessableEntity.md)
 - [GetMarketsStructuresStructureId200Ok](docs/GetMarketsStructuresStructureId200Ok.md)
 - [GetOpportunitiesGroupsGroupIdOk](docs/GetOpportunitiesGroupsGroupIdOk.md)
 - [GetOpportunitiesTasksTaskIdOk](docs/GetOpportunitiesTasksTaskIdOk.md)
 - [GetRouteOriginDestinationNotFound](docs/GetRouteOriginDestinationNotFound.md)
 - [GetSearchOk](docs/GetSearchOk.md)
 - [GetSovereigntyCampaigns200Ok](docs/GetSovereigntyCampaigns200Ok.md)
 - [GetSovereigntyCampaignsParticipant](docs/GetSovereigntyCampaignsParticipant.md)
 - [GetSovereigntyMap200Ok](docs/GetSovereigntyMap200Ok.md)
 - [GetSovereigntyStructures200Ok](docs/GetSovereigntyStructures200Ok.md)
 - [GetStatusOk](docs/GetStatusOk.md)
 - [GetUniverseBloodlines200Ok](docs/GetUniverseBloodlines200Ok.md)
 - [GetUniverseCategoriesCategoryIdNotFound](docs/GetUniverseCategoriesCategoryIdNotFound.md)
 - [GetUniverseCategoriesCategoryIdOk](docs/GetUniverseCategoriesCategoryIdOk.md)
 - [GetUniverseConstellationsConstellationIdNotFound](docs/GetUniverseConstellationsConstellationIdNotFound.md)
 - [GetUniverseConstellationsConstellationIdOk](docs/GetUniverseConstellationsConstellationIdOk.md)
 - [GetUniverseConstellationsConstellationIdPosition](docs/GetUniverseConstellationsConstellationIdPosition.md)
 - [GetUniverseFactions200Ok](docs/GetUniverseFactions200Ok.md)
 - [GetUniverseGraphicsGraphicIdNotFound](docs/GetUniverseGraphicsGraphicIdNotFound.md)
 - [GetUniverseGraphicsGraphicIdOk](docs/GetUniverseGraphicsGraphicIdOk.md)
 - [GetUniverseGroupsGroupIdNotFound](docs/GetUniverseGroupsGroupIdNotFound.md)
 - [GetUniverseGroupsGroupIdOk](docs/GetUniverseGroupsGroupIdOk.md)
 - [GetUniverseMoonsMoonIdNotFound](docs/GetUniverseMoonsMoonIdNotFound.md)
 - [GetUniverseMoonsMoonIdOk](docs/GetUniverseMoonsMoonIdOk.md)
 - [GetUniverseMoonsMoonIdPosition](docs/GetUniverseMoonsMoonIdPosition.md)
 - [GetUniversePlanetsPlanetIdNotFound](docs/GetUniversePlanetsPlanetIdNotFound.md)
 - [GetUniversePlanetsPlanetIdOk](docs/GetUniversePlanetsPlanetIdOk.md)
 - [GetUniversePlanetsPlanetIdPosition](docs/GetUniversePlanetsPlanetIdPosition.md)
 - [GetUniverseRaces200Ok](docs/GetUniverseRaces200Ok.md)
 - [GetUniverseRegionsRegionIdNotFound](docs/GetUniverseRegionsRegionIdNotFound.md)
 - [GetUniverseRegionsRegionIdOk](docs/GetUniverseRegionsRegionIdOk.md)
 - [GetUniverseSchematicsSchematicIdNotFound](docs/GetUniverseSchematicsSchematicIdNotFound.md)
 - [GetUniverseSchematicsSchematicIdOk](docs/GetUniverseSchematicsSchematicIdOk.md)
 - [GetUniverseStargatesStargateIdDestination](docs/GetUniverseStargatesStargateIdDestination.md)
 - [GetUniverseStargatesStargateIdNotFound](docs/GetUniverseStargatesStargateIdNotFound.md)
 - [GetUniverseStargatesStargateIdOk](docs/GetUniverseStargatesStargateIdOk.md)
 - [GetUniverseStargatesStargateIdPosition](docs/GetUniverseStargatesStargateIdPosition.md)
 - [GetUniverseStarsStarIdOk](docs/GetUniverseStarsStarIdOk.md)
 - [GetUniverseStationsStationIdNotFound](docs/GetUniverseStationsStationIdNotFound.md)
 - [GetUniverseStationsStationIdOk](docs/GetUniverseStationsStationIdOk.md)
 - [GetUniverseStationsStationIdPosition](docs/GetUniverseStationsStationIdPosition.md)
 - [GetUniverseStructuresStructureIdNotFound](docs/GetUniverseStructuresStructureIdNotFound.md)
 - [GetUniverseStructuresStructureIdOk](docs/GetUniverseStructuresStructureIdOk.md)
 - [GetUniverseStructuresStructureIdPosition](docs/GetUniverseStructuresStructureIdPosition.md)
 - [GetUniverseSystemJumps200Ok](docs/GetUniverseSystemJumps200Ok.md)
 - [GetUniverseSystemKills200Ok](docs/GetUniverseSystemKills200Ok.md)
 - [GetUniverseSystemsSystemIdNotFound](docs/GetUniverseSystemsSystemIdNotFound.md)
 - [GetUniverseSystemsSystemIdOk](docs/GetUniverseSystemsSystemIdOk.md)
 - [GetUniverseSystemsSystemIdPlanet](docs/GetUniverseSystemsSystemIdPlanet.md)
 - [GetUniverseSystemsSystemIdPosition](docs/GetUniverseSystemsSystemIdPosition.md)
 - [GetUniverseTypesTypeIdDogmaAttribute](docs/GetUniverseTypesTypeIdDogmaAttribute.md)
 - [GetUniverseTypesTypeIdDogmaEffect](docs/GetUniverseTypesTypeIdDogmaEffect.md)
 - [GetUniverseTypesTypeIdNotFound](docs/GetUniverseTypesTypeIdNotFound.md)
 - [GetUniverseTypesTypeIdOk](docs/GetUniverseTypesTypeIdOk.md)
 - [GetWarsWarIdAggressor](docs/GetWarsWarIdAggressor.md)
 - [GetWarsWarIdAlly](docs/GetWarsWarIdAlly.md)
 - [GetWarsWarIdDefender](docs/GetWarsWarIdDefender.md)
 - [GetWarsWarIdKillmails200Ok](docs/GetWarsWarIdKillmails200Ok.md)
 - [GetWarsWarIdKillmailsUnprocessableEntity](docs/GetWarsWarIdKillmailsUnprocessableEntity.md)
 - [GetWarsWarIdOk](docs/GetWarsWarIdOk.md)
 - [GetWarsWarIdUnprocessableEntity](docs/GetWarsWarIdUnprocessableEntity.md)
 - [InternalServerError](docs/InternalServerError.md)
 - [PostCharactersAffiliation200Ok](docs/PostCharactersAffiliation200Ok.md)
 - [PostCharactersAffiliationNotFound](docs/PostCharactersAffiliationNotFound.md)
 - [PostCharactersCharacterIdAssetsLocations200Ok](docs/PostCharactersCharacterIdAssetsLocations200Ok.md)
 - [PostCharactersCharacterIdAssetsNames200Ok](docs/PostCharactersCharacterIdAssetsNames200Ok.md)
 - [PostCharactersCharacterIdCspaCharacters](docs/PostCharactersCharacterIdCspaCharacters.md)
 - [PostCharactersCharacterIdCspaCreated](docs/PostCharactersCharacterIdCspaCreated.md)
 - [PostCharactersCharacterIdFittingsCreated](docs/PostCharactersCharacterIdFittingsCreated.md)
 - [PostCharactersCharacterIdFittingsFitting](docs/PostCharactersCharacterIdFittingsFitting.md)
 - [PostCharactersCharacterIdFittingsItem](docs/PostCharactersCharacterIdFittingsItem.md)
 - [PostCharactersCharacterIdMailBadRequest](docs/PostCharactersCharacterIdMailBadRequest.md)
 - [PostCharactersCharacterIdMailLabelsLabel](docs/PostCharactersCharacterIdMailLabelsLabel.md)
 - [PostCharactersCharacterIdMailMail](docs/PostCharactersCharacterIdMailMail.md)
 - [PostCharactersCharacterIdMailRecipient](docs/PostCharactersCharacterIdMailRecipient.md)
 - [PostFleetsFleetIdMembersInvitation](docs/PostFleetsFleetIdMembersInvitation.md)
 - [PostFleetsFleetIdMembersNotFound](docs/PostFleetsFleetIdMembersNotFound.md)
 - [PostFleetsFleetIdMembersUnprocessableEntity](docs/PostFleetsFleetIdMembersUnprocessableEntity.md)
 - [PostFleetsFleetIdWingsCreated](docs/PostFleetsFleetIdWingsCreated.md)
 - [PostFleetsFleetIdWingsNotFound](docs/PostFleetsFleetIdWingsNotFound.md)
 - [PostFleetsFleetIdWingsWingIdSquadsCreated](docs/PostFleetsFleetIdWingsWingIdSquadsCreated.md)
 - [PostFleetsFleetIdWingsWingIdSquadsNotFound](docs/PostFleetsFleetIdWingsWingIdSquadsNotFound.md)
 - [PostUiOpenwindowNewmailNewMail](docs/PostUiOpenwindowNewmailNewMail.md)
 - [PostUiOpenwindowNewmailUnprocessableEntity](docs/PostUiOpenwindowNewmailUnprocessableEntity.md)
 - [PostUniverseNames200Ok](docs/PostUniverseNames200Ok.md)
 - [PostUniverseNamesNotFound](docs/PostUniverseNamesNotFound.md)
 - [PutCharactersCharacterIdCalendarEventIdResponse](docs/PutCharactersCharacterIdCalendarEventIdResponse.md)
 - [PutCharactersCharacterIdMailMailIdBadRequest](docs/PutCharactersCharacterIdMailMailIdBadRequest.md)
 - [PutCharactersCharacterIdMailMailIdContents](docs/PutCharactersCharacterIdMailMailIdContents.md)
 - [PutCorporationsCorporationIdStructuresStructureIdNewSchedule](docs/PutCorporationsCorporationIdStructuresStructureIdNewSchedule.md)
 - [PutFleetsFleetIdBadRequest](docs/PutFleetsFleetIdBadRequest.md)
 - [PutFleetsFleetIdMembersMemberIdMovement](docs/PutFleetsFleetIdMembersMemberIdMovement.md)
 - [PutFleetsFleetIdMembersMemberIdNotFound](docs/PutFleetsFleetIdMembersMemberIdNotFound.md)
 - [PutFleetsFleetIdMembersMemberIdUnprocessableEntity](docs/PutFleetsFleetIdMembersMemberIdUnprocessableEntity.md)
 - [PutFleetsFleetIdNewSettings](docs/PutFleetsFleetIdNewSettings.md)
 - [PutFleetsFleetIdNotFound](docs/PutFleetsFleetIdNotFound.md)
 - [PutFleetsFleetIdSquadsSquadIdNaming](docs/PutFleetsFleetIdSquadsSquadIdNaming.md)
 - [PutFleetsFleetIdSquadsSquadIdNotFound](docs/PutFleetsFleetIdSquadsSquadIdNotFound.md)
 - [PutFleetsFleetIdWingsWingIdNaming](docs/PutFleetsFleetIdWingsWingIdNaming.md)
 - [PutFleetsFleetIdWingsWingIdNotFound](docs/PutFleetsFleetIdWingsWingIdNotFound.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### evesso

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://login.eveonline.com/oauth/authorize
- **Scopes**: 
  - esi-assets.read_assets.v1: EVE SSO scope esi-assets.read_assets.v1
  - esi-assets.read_corporation_assets.v1: EVE SSO scope esi-assets.read_corporation_assets.v1
  - esi-bookmarks.read_character_bookmarks.v1: EVE SSO scope esi-bookmarks.read_character_bookmarks.v1
  - esi-bookmarks.read_corporation_bookmarks.v1: EVE SSO scope esi-bookmarks.read_corporation_bookmarks.v1
  - esi-calendar.read_calendar_events.v1: EVE SSO scope esi-calendar.read_calendar_events.v1
  - esi-calendar.respond_calendar_events.v1: EVE SSO scope esi-calendar.respond_calendar_events.v1
  - esi-characters.read_agents_research.v1: EVE SSO scope esi-characters.read_agents_research.v1
  - esi-characters.read_blueprints.v1: EVE SSO scope esi-characters.read_blueprints.v1
  - esi-characters.read_chat_channels.v1: EVE SSO scope esi-characters.read_chat_channels.v1
  - esi-characters.read_contacts.v1: EVE SSO scope esi-characters.read_contacts.v1
  - esi-characters.read_corporation_roles.v1: EVE SSO scope esi-characters.read_corporation_roles.v1
  - esi-characters.read_fatigue.v1: EVE SSO scope esi-characters.read_fatigue.v1
  - esi-characters.read_loyalty.v1: EVE SSO scope esi-characters.read_loyalty.v1
  - esi-characters.read_medals.v1: EVE SSO scope esi-characters.read_medals.v1
  - esi-characters.read_notifications.v1: EVE SSO scope esi-characters.read_notifications.v1
  - esi-characters.read_opportunities.v1: EVE SSO scope esi-characters.read_opportunities.v1
  - esi-characters.read_standings.v1: EVE SSO scope esi-characters.read_standings.v1
  - esi-characters.write_contacts.v1: EVE SSO scope esi-characters.write_contacts.v1
  - esi-clones.read_clones.v1: EVE SSO scope esi-clones.read_clones.v1
  - esi-clones.read_implants.v1: EVE SSO scope esi-clones.read_implants.v1
  - esi-contracts.read_character_contracts.v1: EVE SSO scope esi-contracts.read_character_contracts.v1
  - esi-corporations.read_blueprints.v1: EVE SSO scope esi-corporations.read_blueprints.v1
  - esi-corporations.read_contacts.v1: EVE SSO scope esi-corporations.read_contacts.v1
  - esi-corporations.read_corporation_membership.v1: EVE SSO scope esi-corporations.read_corporation_membership.v1
  - esi-corporations.read_divisions.v1: EVE SSO scope esi-corporations.read_divisions.v1
  - esi-corporations.read_structures.v1: EVE SSO scope esi-corporations.read_structures.v1
  - esi-corporations.read_titles.v1: EVE SSO scope esi-corporations.read_titles.v1
  - esi-corporations.track_members.v1: EVE SSO scope esi-corporations.track_members.v1
  - esi-corporations.write_structures.v1: EVE SSO scope esi-corporations.write_structures.v1
  - esi-fittings.read_fittings.v1: EVE SSO scope esi-fittings.read_fittings.v1
  - esi-fittings.write_fittings.v1: EVE SSO scope esi-fittings.write_fittings.v1
  - esi-fleets.read_fleet.v1: EVE SSO scope esi-fleets.read_fleet.v1
  - esi-fleets.write_fleet.v1: EVE SSO scope esi-fleets.write_fleet.v1
  - esi-industry.read_character_jobs.v1: EVE SSO scope esi-industry.read_character_jobs.v1
  - esi-killmails.read_corporation_killmails.v1: EVE SSO scope esi-killmails.read_corporation_killmails.v1
  - esi-killmails.read_killmails.v1: EVE SSO scope esi-killmails.read_killmails.v1
  - esi-location.read_location.v1: EVE SSO scope esi-location.read_location.v1
  - esi-location.read_online.v1: EVE SSO scope esi-location.read_online.v1
  - esi-location.read_ship_type.v1: EVE SSO scope esi-location.read_ship_type.v1
  - esi-mail.organize_mail.v1: EVE SSO scope esi-mail.organize_mail.v1
  - esi-mail.read_mail.v1: EVE SSO scope esi-mail.read_mail.v1
  - esi-mail.send_mail.v1: EVE SSO scope esi-mail.send_mail.v1
  - esi-markets.read_character_orders.v1: EVE SSO scope esi-markets.read_character_orders.v1
  - esi-markets.structure_markets.v1: EVE SSO scope esi-markets.structure_markets.v1
  - esi-planets.manage_planets.v1: EVE SSO scope esi-planets.manage_planets.v1
  - esi-search.search_structures.v1: EVE SSO scope esi-search.search_structures.v1
  - esi-skills.read_skillqueue.v1: EVE SSO scope esi-skills.read_skillqueue.v1
  - esi-skills.read_skills.v1: EVE SSO scope esi-skills.read_skills.v1
  - esi-ui.open_window.v1: EVE SSO scope esi-ui.open_window.v1
  - esi-ui.write_waypoint.v1: EVE SSO scope esi-ui.write_waypoint.v1
  - esi-universe.read_structures.v1: EVE SSO scope esi-universe.read_structures.v1
  - esi-wallet.read_character_wallet.v1: EVE SSO scope esi-wallet.read_character_wallet.v1
  - esi-wallet.read_corporation_wallets.v1: EVE SSO scope esi-wallet.read_corporation_wallets.v1


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



