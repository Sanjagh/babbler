FROM dock.skul.io/common/jre

LABEL Description="Babbler, just babbles!" Vendor="Saverin.co"


ADD target/universal/stage/ /opt/rest/
RUN chmod +x /opt/rest/bin/babbler

WORKDIR /opt/rest

CMD ["bin/babbler"]

MAINTAINER S.H.Ayat h.ayat@saverin.co
