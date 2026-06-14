package com.fancia.backend.shared.auth.core.client.entity

import jakarta.persistence.*
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.time.Instant

@Entity
@Table(name = "`authorizations`")
class Authorization {
    @Id
    var id: String? = null

    @ManyToOne
    var client: Client? = null
    var principalName: String? = null
    var authorizationGrantType: String? = null

    @Column(length = 1000)
    var authorizedScopes: String? = null

    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    var attributes: String? = null

    @Column(length = 500)
    var state: String? = null

    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    var authorizationCodeValue: String? = null
    var authorizationCodeIssuedAt: Instant? = null
    var authorizationCodeExpiresAt: Instant? = null
    var authorizationCodeMetadata: String? = null

    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    var accessTokenValue: String? = null
    var accessTokenIssuedAt: Instant? = null
    var accessTokenExpiresAt: Instant? = null

    @Column(length = 2000)
    var accessTokenMetadata: String? = null
    var accessTokenType: String? = null

    @Column(length = 1000)
    var accessTokenScopes: String? = null

    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    var refreshTokenValue: String? = null
    var refreshTokenIssuedAt: Instant? = null
    var refreshTokenExpiresAt: Instant? = null

    @Column(length = 2000)
    var refreshTokenMetadata: String? = null

    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    var oidcIdTokenValue: String? = null
    var oidcIdTokenIssuedAt: Instant? = null
    var oidcIdTokenExpiresAt: Instant? = null

    @Column(length = 2000)
    var oidcIdTokenMetadata: String? = null

    @Column(length = 2000)
    var oidcIdTokenClaims: String? = null

    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    var userCodeValue: String? = null
    var userCodeIssuedAt: Instant? = null
    var userCodeExpiresAt: Instant? = null

    @Column(length = 2000)
    var userCodeMetadata: String? = null

    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    var deviceCodeValue: String? = null
    var deviceCodeIssuedAt: Instant? = null
    var deviceCodeExpiresAt: Instant? = null

    @Column(length = 2000)
    var deviceCodeMetadata: String? = null
}